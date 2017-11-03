import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.DataBufferByte;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

import javax.imageio.ImageIO;

public class ChangeBase {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		String encodstring = encodeFileToBase64("http://localhost:8080/images/logo.gif");
		System.out.println(encodstring);

	}

	private static byte[] getByteFromImage(String urlStr) throws Exception {
		URL url = new URL(urlStr);
		BufferedImage image = ImageIO.read(url);
		// get DataBufferBytes from Raster
		WritableRaster raster = image.getRaster();
		DataBufferByte data = (DataBufferByte) raster.getDataBuffer();
		return data.getData();
	}

	private static String encodeFileToBase64(String url) {
		String encodedString = null;
		try {
			byte[] bytes = getByteFromImage(url);
			encodedString = new String(Base64.getEncoder().encode(bytes), "UTF-8");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return encodedString;
	}
}
