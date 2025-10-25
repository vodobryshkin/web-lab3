package entities;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.UUID;

/**
 * Класс описывающий модель "Выстрел точки на координатную плоскость".
 */
@Getter @ToString @EqualsAndHashCode
public class Hit {
    private final UUID id = UUID.randomUUID();
    private final Point point;
    private final BigDecimal radius;
    private final boolean status;

    /**
     * Основной конструктор класса с использованием типа Point для точки и BigDecimal для радиуса
     *
     * @param point точка на координатной плоскости
     * @param radius текущий радиус координатной плоскости
     */
    public Hit(Point point, BigDecimal radius, boolean status) {
        this.point = point;
        this.radius = radius;
        this.status = status;
    }

    /**
     * Конструктор класса с передачей параметров координат точки и для радиуса
     * в любом числовом типе данных
     *
     * @param x координата точки по оси абсцисс
     * @param y координата точки по оси ординат
     * @param radius радиус координатной плоскости
     * @param <T> любой числовой тип
     */
    public <T extends Number> Hit(T x, T y, T radius, boolean status) {
       this(new Point(x, y), new BigDecimal(String.valueOf(radius)), status);
    }

    /**
     * Конструктор класса с передачей параметров координат точки и для радиуса
     * в строковом формате
     *
     * @param x координата точки по оси абсцисс
     * @param y координата точки по оси ординат
     * @param radius радиус координатной плоскости
     */
    public Hit(String x, String y, String radius, boolean status) {
        this(new Point(x, y), new BigDecimal(String.valueOf(radius)), status);
    }
}
