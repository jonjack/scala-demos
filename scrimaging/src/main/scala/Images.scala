import com.sksamuel.scrimage._
import com.sksamuel.scrimage.ScaleMethod._
import java.io.{File, FileInputStream, FileOutputStream}

import com.sksamuel.scrimage.nio.{JpegWriter, PngWriter}

//implicit val jpgWriter = JpegWriter().withCompression(0) // No compression
//implicit val jpgWriter = JpegWriter().withCompression(1) // Min compression
//implicit val jpgWriter = JpegWriter().withCompression(5) // Medium compression
//implicit val jpgWriter = JpegWriter().withCompression(9) // Max compression
//implicit val jpgWriter = JpegWriter.NoCompression
//implicit val jpgWriter = JpegWriter.MinCompression
//implicit val jpgWriter = JpegWriter.MaxCompression

//implicit val pngWriter = PngWriter().withCompression(0) // No compression
//implicit val pngWriter = PngWriter().withCompression(1) // Min compression
//implicit val pngWriter = PngWriter().withCompression(5) // Medium compression
//implicit val pngWriter = PngWriter().withCompression(9) // Max compression
//implicit val pngWriter = PngWriter.NoCompression
//implicit val pngWriter = PngWriter.MinCompression
//implicit val pngWriter = PngWriter.MaxCompression

object images extends App {

  // config
  val compressionFactor = 0
  val width = 1000

  // paths
  val inpath = "./images/original"
  val outpath = "./images/output"
  val compression = s"$compressionFactor-compression"
  //val compression = "no-compression"

  // source
  val barracuda = Image.fromFile(new File(s"$inpath/barracuda.jpg"))

  // output
  transformJpgs
  transformPngs

  def transformJpgs = {
    //implicit val jpgWriter = JpegWriter().withCompression(compressionFactor)
    val meta = s"$compression.jpg"
    def file(name: String): File = new File(s"$outpath/$name-$meta")
    barracuda.scaleToWidth(width, FastScale).output(file("barracuda-fastscale"))
    barracuda.scaleToWidth(width, Lanczos3).output(file("barracuda-lanczos3"))
    barracuda.scaleToWidth(width, BSpline).output(file("barracuda-bspline"))
    barracuda.scaleToWidth(width, Bilinear).output(file("barracuda-bilinear"))
    barracuda.scaleToWidth(width, Bicubic).output(file("barracuda-bicubic"))
  }

  def transformPngs = {
    implicit val pngWriter = PngWriter().withCompression(compressionFactor)

    val meta = s"$compression.png"
    def file(name: String): File = new File(s"$outpath/$name-$meta")
    barracuda.scaleToWidth(width, FastScale).output(file("barracuda-fastscale"))
    barracuda.scaleToWidth(width, Lanczos3).output(file("barracuda-lanczos3"))
    barracuda.scaleToWidth(width, BSpline).output(file("barracuda-bspline"))
    barracuda.scaleToWidth(width, Bilinear).output(file("barracuda-bilinear"))
    barracuda.scaleToWidth(width, Bicubic).output(file("barracuda-bicubic"))

  }





    //val permit = Image.fromFile(new File("./images/original/permit.jpg"))

    /*
    val permitin = Image.fromStream(new FileInputStream("./images/original/permit.jpg"))
    val permitout = new FileOutputStream("./images/original/permit.jpg")

    permitin.scaleToWidth(1000, FastScale).output(permitout)
*/


    //permit.scale(0.75, Bicubic).output(new File("./images/output/permit-bicubic-7%"))
    //permit.scale(0.25, Bicubic).output(new File("./images/output/permit-bicubic-25%"))

    //implicit val writer = JpegWriter().withCompression(0).withProgressive(true)

    //val writer = JpegWriter().withCompression(40).withProgressive(true)

    //permit.output(new File("./images/output/permit-comp-50.jpg"))(writer)

    //permit.output(new File("./images/output/permit-comp-50-x"))

    //implicit val progWriter = JpegWriter().withCompression(50).withProgressive(true)
    //permit.output(new File("./images/output/permit-comp-50%-prog.jpg"))

    //permit.scaleToWidth(1000, scaleMethod = Bicubic)

    //permit.scaleToWidth(1000, FastScale).output(new File("./images/output/permit-FastScale-x"))

    //permit.scaleToWidth(1000, FastScale).output(new File("./images/output/permit-FastScale.jpg"))
    //permit.scaleToWidth(1000, FastScale).output(new File("./images/output/permit-FastScale.png"))

    /*
    permit.scaleToWidth(1000, Lanczos3).output(new File("./images/output/permit-Lanczos3.jpg"))
    permit.scaleToWidth(1000, BSpline).output(new File("./images/output/permit-BSpline.jpg"))
    permit.scaleToWidth(1000, Bilinear).output(new File("./images/output/permit-Bilinear.jpg"))
    permit.scaleToWidth(1000, Bicubic).output(new File("./images/output/permit-Bicubic.jpg"))

    permit.scaleToWidth(1000, FastScale).output(new File("./images/output/permit-FastScale.jpg"))
    permit.scaleToWidth(1000, Lanczos3).output(new File("./images/output/permit-Lanczos3.jpg"))
    permit.scaleToWidth(1000, BSpline).output(new File("./images/output/permit-BSpline.jpg"))
    permit.scaleToWidth(1000, Bilinear).output(new File("./images/output/permit-Bilinear.jpg"))
    permit.scaleToWidth(1000, Bicubic).output(new File("./images/output/permit-Bicubic.jpg"))

*/
    /**
    // Try JPG
    barracuda.scaleTo(1000, 600, FastScale).output(new File("./images/output/barracuda-FastScale.jpg"))
    barracuda.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/barracuda-Lanczos3.jpg"))
    barracuda.scaleTo(1000, 600, BSpline).output(new File("./images/output/barracuda-BSpline.jpg"))
    barracuda.scaleTo(1000, 600, Bilinear).output(new File("./images/output/barracuda-Bilinear.jpg"))
    barracuda.scaleTo(1000, 600, Bicubic).output(new File("./images/output/barracuda-Bicubic.jpg"))
    
    // Try PNG
    barracuda.scaleTo(1000, 600, FastScale).output(new File("./images/output/barracuda-FastScale.png"))
    barracuda.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/barracuda-Lanczos3.png"))
    barracuda.scaleTo(1000, 600, BSpline).output(new File("./images/output/barracuda-BSpline.png"))
    barracuda.scaleTo(1000, 600, Bilinear).output(new File("./images/output/barracuda-Bilinear.png"))
    barracuda.scaleTo(1000, 600, Bicubic).output(new File("./images/output/barracuda-Bicubic.png"))

    barracuda.scale(0.5, Bicubic).output(new File("./images/output/barracuda-Bicubic.png"))

    val perch = Image.fromFile(new File("./images/original/perch.jpg"))
    
    // Try JPG
    perch.scaleTo(1000, 600, FastScale).output(new File("./images/output/perch-FastScale.jpg"))    
    perch.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/perch-Lanczos3.jpg"))    
    perch.scaleTo(1000, 600, BSpline).output(new File("./images/output/perch-BSpline.jpg"))     
    perch.scaleTo(1000, 600, Bilinear).output(new File("./images/output/perch-Bilinear.jpg"))   
    perch.scaleTo(1000, 600, Bicubic).output(new File("./images/output/perch-Bicubic.jpg"))      
    
    // Try PNG
    perch.scaleTo(1000, 600, FastScale).output(new File("./images/output/perch-FastScale.png"))    
    perch.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/perch-Lanczos3.png"))    
    perch.scaleTo(1000, 600, BSpline).output(new File("./images/output/perch-BSpline.png"))     
    perch.scaleTo(1000, 600, Bilinear).output(new File("./images/output/perch-Bilinear.png"))  
    perch.scaleTo(1000, 600, Bicubic).output(new File("./images/output/perch-Bicubic.png"))   
 
    // Resize Width (800) but not Height
    perch.scaleToWidth(800, FastScale).output(new File("./images/output/perch-800-FastScale.jpg"))
    perch.scaleToWidth(800, Lanczos3).output(new File("./images/output/perch-800-Lanczos3.jpg"))
    perch.scaleToWidth(800, BSpline).output(new File("./images/output/perch-800-BSpline.jpg"))
    perch.scaleToWidth(800, Bilinear).output(new File("./images/output/perch-800-Bilinear.jpg"))
    perch.scaleToWidth(800, Bicubic).output(new File("./images/output/perch-800-Bicubic.jpg"))
    

    val tarpon = Image.fromFile(new File("./images/original/carp.jpg"))
    
    // Try JPG
    tarpon.scaleTo(1000, 600, FastScale).output(new File("./images/output/tarpon-FastScale.jpg"))    
    tarpon.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/tarpon-Lanczos3.jpg"))    
    tarpon.scaleTo(1000, 600, BSpline).output(new File("./images/output/tarpon-BSpline.jpg"))     
    tarpon.scaleTo(1000, 600, Bilinear).output(new File("./images/output/tarpon-Bilinear.jpg"))   
    tarpon.scaleTo(1000, 600, Bicubic).output(new File("./images/output/tarpon-Bicubic.jpg"))      
    
    // Try PNG
    tarpon.scaleTo(1000, 600, FastScale).output(new File("./images/output/tarpon-FastScale.png"))    
    tarpon.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/tarpon-Lanczos3.png"))    
    tarpon.scaleTo(1000, 600, BSpline).output(new File("./images/output/tarpon-BSpline.png"))     
    tarpon.scaleTo(1000, 600, Bilinear).output(new File("./images/output/tarpon-Bilinear.png"))  
    tarpon.scaleTo(1000, 600, Bicubic).output(new File("./images/output/tarpon-Bicubic.png")) 

    // Resize Width (800) but not Height
    tarpon.scaleToWidth(800, FastScale).output(new File("./images/output/tarpon-800-FastScale.jpg"))
    tarpon.scaleToWidth(800, Lanczos3).output(new File("./images/output/tarpon-800-Lanczos3.jpg"))
    tarpon.scaleToWidth(800, BSpline).output(new File("./images/output/tarpon-800-BSpline.jpg"))
    tarpon.scaleToWidth(800, Bilinear).output(new File("./images/output/tarpon-800-Bilinear.jpg"))
    tarpon.scaleToWidth(800, Bicubic).output(new File("./images/output/tarpon-800-Bicubic.jpg"))
    

    val tuna = Image.fromFile(new File("./images/original/carp.jpg"))
    
    // Try JPG
    tuna.scaleTo(1000, 600, FastScale).output(new File("./images/output/tuna-FastScale.jpg"))    
    tuna.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/tuna-Lanczos3.jpg"))    
    tuna.scaleTo(1000, 600, BSpline).output(new File("./images/output/tuna-BSpline.jpg"))     
    tuna.scaleTo(1000, 600, Bilinear).output(new File("./images/output/tuna-Bilinear.jpg"))   
    tuna.scaleTo(1000, 600, Bicubic).output(new File("./images/output/tuna-Bicubic.jpg"))      
    
    // Try PNG
    tuna.scaleTo(1000, 600, FastScale).output(new File("./images/output/tuna-FastScale.png"))    
    tuna.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/tuna-Lanczos3.png"))    
    tuna.scaleTo(1000, 600, BSpline).output(new File("./images/output/tuna-BSpline.png"))     
    tuna.scaleTo(1000, 600, Bilinear).output(new File("./images/output/tuna-Bilinear.png"))  
    tuna.scaleTo(1000, 600, Bicubic).output(new File("./images/output/tuna-Bicubic.png")) 
    
    // Resize Width (800) but not Height
    tuna.scaleToWidth(800, FastScale).output(new File("./images/output/tuna-800-FastScale.jpg"))
    tuna.scaleToWidth(800, Lanczos3).output(new File("./images/output/tuna-800-Lanczos3.jpg"))
    tuna.scaleToWidth(800, BSpline).output(new File("./images/output/tuna-800-BSpline.jpg"))
    tuna.scaleToWidth(800, Bilinear).output(new File("./images/output/tuna-800-Bilinear.jpg"))
    tuna.scaleToWidth(800, Bicubic).output(new File("./images/output/tuna-800-Bicubic.jpg"))
    
    
    val whiteshark = Image.fromFile(new File("./images/original/whiteshark.jpg"))
    
    // Try JPG
    whiteshark.scaleTo(1000, 600, FastScale).output(new File("./images/output/whiteshark-FastScale.jpg"))    
    whiteshark.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/whiteshark-Lanczos3.jpg"))    
    whiteshark.scaleTo(1000, 600, BSpline).output(new File("./images/output/whiteshark-BSpline.jpg"))     
    whiteshark.scaleTo(1000, 600, Bilinear).output(new File("./images/output/whiteshark-Bilinear.jpg"))   
    whiteshark.scaleTo(1000, 600, Bicubic).output(new File("./images/output/whiteshark-Bicubic.jpg"))      
    
    // Try PNG
    whiteshark.scaleTo(1000, 600, FastScale).output(new File("./images/output/whiteshark-FastScale.png"))    
    whiteshark.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/whiteshark-Lanczos3.png"))    
    whiteshark.scaleTo(1000, 600, BSpline).output(new File("./images/output/whiteshark-BSpline.png"))     
    whiteshark.scaleTo(1000, 600, Bilinear).output(new File("./images/output/whiteshark-Bilinear.png"))  
    whiteshark.scaleTo(1000, 600, Bicubic).output(new File("./images/output/whiteshark-Bicubic.png")) 
    
    // Resize Width (800) but not Height
    whiteshark.scaleToWidth(800, FastScale).output(new File("./images/output/whiteshark-800-FastScale.jpg"))
    whiteshark.scaleToWidth(800, Lanczos3).output(new File("./images/output/whiteshark-800-Lanczos3.jpg"))
    whiteshark.scaleToWidth(800, BSpline).output(new File("./images/output/whiteshark-800-BSpline.jpg"))
    whiteshark.scaleToWidth(800, Bilinear).output(new File("./images/output/whiteshark-800-Bilinear.jpg"))
    whiteshark.scaleToWidth(800, Bicubic).output(new File("./images/output/whiteshark-800-Bicubic.jpg"))

      **/

}