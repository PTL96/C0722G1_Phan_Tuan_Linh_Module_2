package ss6_Inheritance.exercise3;

public class MovablePoint extends Point {
    private float _Xspeed = 0.0f;
    private float _Yspeed = 0.0f;

    public MovablePoint(float _Xspeed, float _Yspeed) {
        this._Xspeed = _Xspeed;
        this._Yspeed = _Yspeed;
    }

    public MovablePoint(float x, float y, float _Xspeed, float _Yspeed) {
        super(x, y);
        this._Xspeed = _Xspeed;
        this._Yspeed = _Yspeed;
    }

    public MovablePoint() {
    }

    public float get_Xspeed() {
        return _Xspeed;
    }

    public void set_Xspeed(float _Xspeed) {
        this._Xspeed = _Xspeed;
    }

    public float get_Yspeed() {
        return _Yspeed;
    }

    public void set_Yspeed(float _Yspeed) {
        this._Yspeed = _Yspeed;
    }
    public void set_Yspeed_Xspeed(float _Yspeed, float _Xspeed){
        this._Xspeed=_Xspeed;
        this._Yspeed = _Yspeed;
    }
public  MovablePoint move() {
    setX(getX()+_Xspeed);
    setY(getY()+_Yspeed);
        return this;
}

    @Override
    public String toString() {
        return "{" +
                "_Xspeed=" + _Xspeed +
                ", _Yspeed=" + _Yspeed +
                " X="+getX()+
                " Y="+getY()+
                '}';
    }


}
