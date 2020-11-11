package Text8.q3;

import java.util.Observable;
/**
 *
 * <p>Title: The Model part of Application</p>
 * <p>Description: This class represents an observable object,
 * or "data" in the model-view paradigm. It can be subclassed to represent
 * an object that the application wants to have observed. </p>
 * <p>Copyright: Copyright (c) 2005</p>
 * @author Smart Lee
 * @version 1.1
 */
public class Sphere extends Observable {
    // 定义球体半径
    private double sphereRadius;
    // 定义球体体积
    private double sphereVolume;
    // 定义球体表面积
    private double sphereSuArea;
    /**
     * 根据球体半径值设置球体三个属性值
     * @param sphereRadius double
     */
    public void setRadius (double sphereRadius) {
        this.sphereRadius = sphereRadius;
        this.sphereVolume = 4 * Math.PI * Math.pow(sphereRadius, 3) / 3;
        this.sphereSuArea = 4 * Math.PI * Math.pow(sphereRadius, 2);
        //变化后通知视图做相应变化
        setChanged();
        notifyObservers();
    }
    /**
     * 根据球体体积值设置球体三个属性值
     * @param sphereVolume double
     */
    public void setVolume(double sphereVolume) {
        this.sphereVolume = sphereVolume;
        this.sphereRadius = Math.pow(3 * sphereVolume / (4 * Math.PI), 1 / 3.0);
        this.sphereSuArea = 3 * sphereVolume / sphereRadius;
        setChanged();
        notifyObservers();
    }
    /**
     * 根据球体表面积值设置球体三个属性值
     * @param sphereSuArea double
     */
    public void setSuArea(double sphereSuArea) {
        this.sphereSuArea = sphereSuArea;
        this.sphereRadius = Math.pow(sphereSuArea / (4 * Math.PI), 1 / 2.0);
        this.sphereVolume = sphereSuArea * sphereRadius /3;
        setChanged();
        notifyObservers();
    }
    /**
     * 取得球体半径值
     * @return double
     */
    public double getRadius() {
        return sphereRadius;
    }
    /**
     * 取得球体体积值
     * @return double
     */
    public double getVolume() {
        return sphereVolume;
    }
    /**
     * 取得球体表面积值
     * @return double
     */
    public double getSuArea() {
        return sphereSuArea;
    }
}
