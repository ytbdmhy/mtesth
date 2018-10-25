package mtesth.base.utils;

import javax.imageio.ImageIO;
import javax.imageio.stream.ImageOutputStream;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Random;

public class ImageVaidateCodeUtil {

	public static void main(String[] args) {
		ImageVaidateCodeUtil image = new ImageVaidateCodeUtil();
		System.out.println(image.getCode());
		System.out.println(image.getBuffImg());
		BufferedImage bi = image.getBuffImg();
		ImageOutputStream imOut;
		InputStream is = null;
		ByteArrayOutputStream bs = new ByteArrayOutputStream();
		try {
			imOut = ImageIO.createImageOutputStream(bs);
			ImageIO.write(bi, "jpg", imOut);
			is = new ByteArrayInputStream(bs.toByteArray());
			String strBase64 = Base64Util.encode(toByteArray(is));
			System.out.println(strBase64);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static byte[] toByteArray(InputStream input) throws IOException {
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		byte[] buffer = new byte[4096];
		int n = 0;
		while (-1 != (n = input.read(buffer))) {
			output.write(buffer, 0, n);
		}
		return output.toByteArray();
	}

	// 图片的宽度。
	private int width = 160;
	// 图片的高度。
	private int height = 40;
	// 验证码字符个数
	private int codeCount = 4;
	// 验证码干扰线数
	private int lineCount = 20;
	// 验证码
	private String code = null;
	// 验证码图片Buffer
	private BufferedImage buffImg = null;
	Random random = new Random();

	public ImageVaidateCodeUtil() {
		creatImage();
	}

	public ImageVaidateCodeUtil(int width, int height) {
		this.width = width;
		this.height = height;
		creatImage();
	}

	public ImageVaidateCodeUtil(int width, int height, int codeCount) {
		this.width = width;
		this.height = height;
		this.codeCount = codeCount;
		creatImage();
	}

	public ImageVaidateCodeUtil(int width, int height, int codeCount, int lineCount) {
		this.width = width;
		this.height = height;
		this.codeCount = codeCount;
		this.lineCount = lineCount;
		creatImage();
	}

	// 生成图片
	private void creatImage() {
		int fontWidth = width / codeCount;// 字体的宽度
		int fontHeight = height - 5;// 字体的高度
		int codeY = height - 8;

		// 图像buffer
		buffImg = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
		Graphics g = buffImg.getGraphics();
		// Graphics2D g = buffImg.createGraphics();
		// 设置背景色
		g.setColor(getRandColor(200, 250));
		g.fillRect(0, 0, width, height);

		// 设置字体
		// Font font = getFont(fontHeight);
		Font font = new Font("Fixedsys", Font.BOLD, fontHeight);
		g.setFont(font);

		// 设置干扰线
		for (int i = 0; i < lineCount; i++) {
			int xs = random.nextInt(width);
			int ys = random.nextInt(height);
			int xe = xs + random.nextInt(width);
			int ye = ys + random.nextInt(height);
			g.setColor(getRandColor(1, 255));
			g.drawLine(xs, ys, xe, ye);
		}

		// 添加噪点
		float yawpRate = 0.01f;// 噪声率
		int area = (int) (yawpRate * width * height);
		for (int i = 0; i < area; i++) {
			int x = random.nextInt(width);
			int y = random.nextInt(height);

			buffImg.setRGB(x, y, random.nextInt(255));
		}

		String str1 = randomStr(codeCount);// 得到随机字符
		this.code = str1;
		for (int i = 0; i < codeCount; i++) {
			String strRand = str1.substring(i, i + 1);
			g.setColor(getRandColor(1, 255));
			// g.drawString(a,x,y);
			// a为要画出来的东西，x和y表示要画的东西最左侧字符的基线位于此图形上下文坐标系的 (x, y) 位置处

			g.drawString(strRand, i * fontWidth + 3, codeY);
		}

		writeCurve(g);

	}

	// 得到随机字符
	private String randomStr(int n) {
		String str1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
		String str2 = "";
		int len = str1.length() - 1;
		double r;
		for (int i = 0; i < n; i++) {
			r = (Math.random()) * len;
			str2 = str2 + str1.charAt((int) r);
		}
		return str2;
	}

	// 得到随机颜色
	private Color getRandColor(int fc, int bc) {// 给定范围获得随机颜色
		if (fc > 255)
			fc = 255;
		if (bc > 255)
			bc = 255;
		int r = fc + random.nextInt(bc - fc);
		int g = fc + random.nextInt(bc - fc);
		int b = fc + random.nextInt(bc - fc);
		return new Color(r, g, b);
	}

	/**
	 * 产生随机字体
	 */
	private Font getFont(int size) {
		Random random = new Random();
		Font font[] = new Font[5];
		font[0] = new Font("Ravie", Font.PLAIN, size);
		font[1] = new Font("Antique Olive Compact", Font.PLAIN, size);
		font[2] = new Font("Fixedsys", Font.PLAIN, size);
		font[3] = new Font("Wide Latin", Font.PLAIN, size);
		font[4] = new Font("Gill Sans Ultra Bold", Font.PLAIN, size);
		return font[random.nextInt(5)];
	}

	// 扭曲方法
	@SuppressWarnings("unused")
	private void shear(Graphics g, int w1, int h1, Color color) {
		shearX(g, w1, h1, color);
		shearY(g, w1, h1, color);
	}

	/**
	 * 画一条由两条连在一起构成的随机正弦函数曲线作干扰线(你可以改成更帅的曲线函数)
	 * 高中的数学公式咋都忘了涅，写出来
	 * 正弦型函数解析式：y=Asin(ωx+φ)+b
	 * 各常数值对函数图像的影响：
	 * A：决定峰值（即纵向拉伸压缩的倍数）
	 * b：表示波形在Y轴的位置关系或纵向移动距离（上加下减）
	 * φ：决定波形与X轴位置关系或横向移动距离（左加右减）
	 * ω：决定周期（最小正周期T=2π/∣ω∣）
	 */
	private void writeCurve(Graphics g) {
		double px, py = 0;
		int fontHeight = height - 5;// 字体的高度
		// 曲线前部分
		double A = random.nextInt(height / 2) + 1;                  // 振幅
		double b = random.nextInt(height / 2 + 1) - height / 4;   // Y轴方向偏移量
		double f = random.nextInt(height / 2 + 1) - height / 4;   // X轴方向偏移量
		double T = random.nextInt(width * 2 - height + 1) + height;// 周期
		double w = (2 * Math.PI) / T;
		int px1 = 0;  // 曲线横坐标起始位置
		int px2 = random.nextInt((int) (width * 0.8) - width / 2 + 1) + width / 2;// + mt_rand($this -> imageW / 2, $this -> width * 0.8);  // 曲线横坐标结束位置
		for (px = px1; px <= px2; px = px + 1) {
			if (w != 0) {
				py = A * Math.sin(w * px + f) + b + (double) height / 2;  // y = Asin(ωx+φ) + b
				int i = (int) (fontHeight / 7);
				while (i > 0) {
					g.drawLine((int) px + i, (int) py + i, (int) px + i + 1, (int) py + i + 1);
					i--;
				}
			}
		}
		// 曲线后部分
		A = random.nextInt(height / 2) + 1;                  // 振幅
		f = random.nextInt(height / 2 + 1) - height / 4;   // X轴方向偏移量
		T = random.nextInt(width * 2 - height + 1) + height;  // 周期
		w = (2 * Math.PI) / T;
		b = py - A * Math.sin(w * px + f) - height / 2;
		px1 = px2;
		px2 = width;
		for (px = px1; px <= px2; px = px + 1) {
			if (w != 0) {
				py = A * Math.sin(w * px + f) + b + height / 2;  // y = Asin(ωx+φ) + b
				int i = (int) (fontHeight / 7);
				while (i > 0) {
					g.drawLine((int) px + i, (int) py + i, (int) px + i + 1, (int) py + i + 1);
					i--;
				}
			}
		}
	}

	private void shearX(Graphics g, int w1, int h1, Color color) {

		int period = random.nextInt(2);

		boolean borderGap = true;
		int frames = 1;
		int phase = random.nextInt(2);

		for (int i = 0; i < h1; i++) {
			double d = (double) (period >> 1) * Math.sin((double) i / (double) period + (6.2831853071795862D * (double) phase) / (double) frames);
			g.copyArea(0, i, w1, 1, (int) d, 0);
			if (borderGap) {
				g.setColor(color);
				g.drawLine((int) d, i, 0, i);
				g.drawLine((int) d + w1, i, w1, i);
			}
		}

	}

	private void shearY(Graphics g, int w1, int h1, Color color) {

		int period = random.nextInt(40) + 10; // 50;

		boolean borderGap = true;
		int frames = 20;
		int phase = 7;
		for (int i = 0; i < w1; i++) {
			double d = (double) (period >> 1) * Math.sin((double) i / (double) period + (6.2831853071795862D * (double) phase) / (double) frames);
			g.copyArea(i, 0, 1, h1, 0, (int) d);
			if (borderGap) {
				g.setColor(color);
				g.drawLine(i, (int) d, i, 0);
				g.drawLine(i, (int) d + h1, i, h1);
			}

		}

	}

	public void write(OutputStream sos) throws IOException {
		ImageIO.write(buffImg, "png", sos);
		sos.close();
	}

	public BufferedImage getBuffImg() {
		return buffImg;
	}

	public String getCode() {
		return code.toLowerCase();
	}

}
