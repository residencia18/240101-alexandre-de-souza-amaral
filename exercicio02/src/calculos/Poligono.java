package calculos;
import java.util.ArrayList;
import calculos.Ponto;
import java.lang.Math;

class Poligono {
    ArrayList<Ponto> pontos;

    Poligono() {
        pontos = new ArrayList<Ponto>();
    }

    void inserePonto(float x, float y, float z) {
        Ponto p = new Ponto(x, y, z);
        pontos.add(p);
    }

    float perimetro() {
        float per = 0;
        for (int i = 0; i < pontos.size() - 1; i++) {
            Ponto p1 = pontos.get(i);
            Ponto p2 = pontos.get(i + 1);
            per += Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2) + Math.pow(p1.z - p2.z, 2));
        }
        
        Ponto primeiroPonto = pontos.get(0);
        Ponto ultimoPonto = pontos.get(pontos.size() - 1);
        per += Math.sqrt(Math.pow(primeiroPonto.x - ultimoPonto.x, 2) + Math.pow(primeiroPonto.y - ultimoPonto.y, 2) + Math.pow(primeiroPonto.z - ultimoPonto.z, 2));

        return per;
    }
}
