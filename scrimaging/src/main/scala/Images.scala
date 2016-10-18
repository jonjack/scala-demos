import com.sksamuel.scrimage._
import com.sksamuel.scrimage.ScaleMethod._
import java.io.File

object images {

  def main(args: Array[String]): Unit = {
    

    val barracuda = Image.fromFile(new File("./images/original/carp.jpg"))

    // Try JPG
    barracuda.scaleTo(1000, 600, FastScale).output(new File("./images/output/carp-FastScale.jpg"))    
    barracuda.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/carp-Lanczos3.jpg"))    
    barracuda.scaleTo(1000, 600, BSpline).output(new File("./images/output/carp-BSpline.jpg"))     
    barracuda.scaleTo(1000, 600, Bilinear).output(new File("./images/output/carp-Bilinear.jpg"))   
    barracuda.scaleTo(1000, 600, Bicubic).output(new File("./images/output/carp-Bicubic.jpg"))      
    
    // Try PNG
    barracuda.scaleTo(1000, 600, FastScale).output(new File("./images/output/carp-FastScale.png"))    
    barracuda.scaleTo(1000, 600, Lanczos3).output(new File("./images/output/carp-Lanczos3.png"))    
    barracuda.scaleTo(1000, 600, BSpline).output(new File("./images/output/carp-BSpline.png"))     
    barracuda.scaleTo(1000, 600, Bilinear).output(new File("./images/output/carp-Bilinear.png"))  
    barracuda.scaleTo(1000, 600, Bicubic).output(new File("./images/output/carp-Bicubic.png"))     


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
    
  }

}