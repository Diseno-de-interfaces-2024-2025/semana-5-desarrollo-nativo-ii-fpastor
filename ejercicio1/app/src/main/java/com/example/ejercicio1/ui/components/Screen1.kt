import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.ejercicio1.R

@Composable
fun Screen1() {
    Box(
        Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Box() {
            Image(
                painter = painterResource(R.drawable.person),
                contentDescription = "",
                contentScale = ContentScale.Fit
            )
        }
    }
}