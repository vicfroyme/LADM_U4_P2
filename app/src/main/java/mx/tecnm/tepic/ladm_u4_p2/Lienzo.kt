package mx.tecnm.tepic.ladm_u4_p2

import android.graphics.*
import android.view.View

class Lienzo (p:MainActivity) : View(p) {
    //coordenadas de las imagenes
    var cx = 200f
    var cy = 20f
    var fondo = true
    //imagenes
    val sol : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.sol)
    val nube : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.nubes)
    val luna : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.lun)
    val estrella : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.estrella)
    val superman : Bitmap = BitmapFactory.decodeResource(resources, R.drawable.superman)

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)

        var paint = Paint()

        //fondo
        if (fondo){
            //PINTAR FONDO DE DIA
            canvas.drawColor(Color.CYAN)
            canvas.drawBitmap(sol, 50f, 50f, paint)
            canvas.drawBitmap(nube,400f, 100f, paint)
            canvas.drawBitmap(nube,600f,500f, paint)
            canvas.drawBitmap(superman,cx,cy,paint)

        }else{
            //PINTAR FONDO NOCTURNO
            canvas.drawColor(Color.BLACK)
            canvas.drawBitmap(luna, 300f, 800f, paint)
            canvas.drawBitmap(estrella,300f, 100f, paint)
            canvas.drawBitmap(estrella,500f, 500f, paint)
            canvas.drawBitmap(estrella,450f, 1000f, paint)
            canvas.drawBitmap(superman,cx,cy,paint)

        }

    }

}