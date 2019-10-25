package condiciones;

import sistema.Animal;

public class CondicionACapado implements CondicionA {
    @Override
    public boolean cumple(Animal a) {
        return a.isCapado();
    }
}
