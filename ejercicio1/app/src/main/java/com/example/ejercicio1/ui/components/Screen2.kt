
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.ejercicio1.R

@Composable
fun Screen2(){
    Box(Modifier.fillMaxSize(),
        contentAlignment = Alignment.TopCenter){

        LazyColumn (modifier = Modifier.padding(horizontal = 16.dp).fillMaxWidth()) {
            item {
                Column(Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.history),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Text(
                        text = "History",
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 16.dp))
                }
            }

            item {
                Column(Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.computerscience),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Text(
                        text = "Computer Science",
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 16.dp))
                }
            }

            item {
                Column(Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.uidesign),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Text(
                        text = "UI Design",
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 16.dp))
                }
            }

            item {
                Column(Modifier.fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)) {
                    Box(
                        Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .clip(shape = RoundedCornerShape(20.dp))
                    ) {
                        Image(
                            painter = painterResource(R.drawable.concurrentprogramming),
                            contentDescription = "",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.fillMaxWidth()
                        )
                    }
                    Text(
                        text = "Concurrent Programming",
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = 16.dp))
                }
            }


        }
    }
}