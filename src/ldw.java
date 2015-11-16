// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;

public abstract class ldw extends ldy
{

    private static final long serialVersionUID = 0xa29fafd9a2b7b8f9L;
    private transient lcy A;
    private transient lcy B;
    private transient lcy C;
    private transient lcy D;
    private transient lcy E;
    private transient lcy F;
    private transient lcy G;
    private transient lcy H;
    private transient lcy I;
    private transient lcy J;
    private transient lcy K;
    private transient int L;
    final lcw a;
    final Object b;
    transient ldh c;
    transient ldh d;
    transient ldh e;
    transient ldh f;
    transient ldh g;
    transient lcy h;
    transient lcy i;
    transient lcy j;
    private transient ldh k;
    private transient ldh l;
    private transient ldh m;
    private transient ldh n;
    private transient ldh o;
    private transient ldh p;
    private transient ldh q;
    private transient lcy r;
    private transient lcy s;
    private transient lcy t;
    private transient lcy u;
    private transient lcy v;
    private transient lcy w;
    private transient lcy x;
    private transient lcy y;
    private transient lcy z;

    protected ldw(lcw lcw1, Object obj)
    {
        a = lcw1;
        b = obj;
        L();
    }

    private void L()
    {
        boolean flag = false;
        int i1 = 0;
        ldx ldx1 = new ldx();
        if (a != null)
        {
            ldx1.a(a);
        }
        a(ldx1);
        Object obj = ldx1.a;
        if (obj == null)
        {
            obj = super.c();
        }
        k = ((ldh) (obj));
        obj = ldx1.b;
        if (obj == null)
        {
            obj = super.f();
        }
        l = ((ldh) (obj));
        obj = ldx1.c;
        if (obj == null)
        {
            obj = super.i();
        }
        m = ((ldh) (obj));
        obj = ldx1.d;
        if (obj == null)
        {
            obj = super.l();
        }
        n = ((ldh) (obj));
        obj = ldx1.e;
        if (obj == null)
        {
            obj = super.o();
        }
        o = ((ldh) (obj));
        obj = ldx1.f;
        if (obj == null)
        {
            obj = super.s();
        }
        c = ((ldh) (obj));
        obj = ldx1.g;
        if (obj == null)
        {
            obj = super.w();
        }
        d = ((ldh) (obj));
        obj = ldx1.h;
        if (obj == null)
        {
            obj = super.y();
        }
        e = ((ldh) (obj));
        obj = ldx1.i;
        if (obj == null)
        {
            obj = super.B();
        }
        f = ((ldh) (obj));
        obj = ldx1.j;
        if (obj == null)
        {
            obj = super.D();
        }
        g = ((ldh) (obj));
        obj = ldx1.k;
        if (obj == null)
        {
            obj = super.H();
        }
        p = ((ldh) (obj));
        obj = ldx1.l;
        if (obj == null)
        {
            obj = super.J();
        }
        q = ((ldh) (obj));
        obj = ldx1.m;
        if (obj == null)
        {
            obj = super.d();
        }
        r = ((lcy) (obj));
        obj = ldx1.n;
        if (obj == null)
        {
            obj = super.e();
        }
        s = ((lcy) (obj));
        obj = ldx1.o;
        if (obj == null)
        {
            obj = super.g();
        }
        t = ((lcy) (obj));
        obj = ldx1.p;
        if (obj == null)
        {
            obj = super.h();
        }
        u = ((lcy) (obj));
        obj = ldx1.q;
        if (obj == null)
        {
            obj = super.j();
        }
        v = ((lcy) (obj));
        obj = ldx1.r;
        if (obj == null)
        {
            obj = super.k();
        }
        w = ((lcy) (obj));
        obj = ldx1.s;
        if (obj == null)
        {
            obj = super.m();
        }
        x = ((lcy) (obj));
        obj = ldx1.t;
        if (obj == null)
        {
            obj = super.n();
        }
        y = ((lcy) (obj));
        obj = ldx1.u;
        if (obj == null)
        {
            obj = super.p();
        }
        z = ((lcy) (obj));
        obj = ldx1.v;
        if (obj == null)
        {
            obj = super.q();
        }
        A = ((lcy) (obj));
        obj = ldx1.w;
        if (obj == null)
        {
            obj = super.r();
        }
        B = ((lcy) (obj));
        obj = ldx1.x;
        if (obj == null)
        {
            obj = super.t();
        }
        h = ((lcy) (obj));
        obj = ldx1.y;
        if (obj == null)
        {
            obj = super.u();
        }
        C = ((lcy) (obj));
        obj = ldx1.z;
        if (obj == null)
        {
            obj = super.v();
        }
        D = ((lcy) (obj));
        obj = ldx1.A;
        if (obj == null)
        {
            obj = super.x();
        }
        i = ((lcy) (obj));
        obj = ldx1.B;
        if (obj == null)
        {
            obj = super.z();
        }
        E = ((lcy) (obj));
        obj = ldx1.C;
        if (obj == null)
        {
            obj = super.A();
        }
        F = ((lcy) (obj));
        obj = ldx1.D;
        if (obj == null)
        {
            obj = super.C();
        }
        G = ((lcy) (obj));
        obj = ldx1.E;
        if (obj == null)
        {
            obj = super.E();
        }
        j = ((lcy) (obj));
        obj = ldx1.F;
        if (obj == null)
        {
            obj = super.F();
        }
        H = ((lcy) (obj));
        obj = ldx1.G;
        if (obj == null)
        {
            obj = super.G();
        }
        I = ((lcy) (obj));
        obj = ldx1.H;
        if (obj == null)
        {
            obj = super.I();
        }
        J = ((lcy) (obj));
        obj = ldx1.I;
        if (obj == null)
        {
            obj = super.K();
        }
        K = ((lcy) (obj));
        if (a != null)
        {
            byte byte0;
            byte byte1;
            if (x == a.m() && v == a.j() && t == a.g() && r == a.d())
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (s == a.e())
            {
                byte0 = 2;
            } else
            {
                byte0 = 0;
            }
            byte1 = flag;
            if (j == a.E())
            {
                byte1 = flag;
                if (G == a.C())
                {
                    byte1 = flag;
                    if (C == a.u())
                    {
                        byte1 = 4;
                    }
                }
            }
            i1 = byte1 | (i1 | byte0);
        }
        L = i1;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        L();
    }

    public final lcy A()
    {
        return F;
    }

    public final ldh B()
    {
        return f;
    }

    public final lcy C()
    {
        return G;
    }

    public final ldh D()
    {
        return g;
    }

    public final lcy E()
    {
        return j;
    }

    public final lcy F()
    {
        return H;
    }

    public final lcy G()
    {
        return I;
    }

    public final ldh H()
    {
        return p;
    }

    public final lcy I()
    {
        return J;
    }

    public final ldh J()
    {
        return q;
    }

    public final lcy K()
    {
        return K;
    }

    public ldd a()
    {
        lcw lcw1 = a;
        if (lcw1 != null)
        {
            return lcw1.a();
        } else
        {
            return null;
        }
    }

    protected abstract void a(ldx ldx1);

    public final ldh c()
    {
        return k;
    }

    public final lcy d()
    {
        return r;
    }

    public final lcy e()
    {
        return s;
    }

    public final ldh f()
    {
        return l;
    }

    public final lcy g()
    {
        return t;
    }

    public final lcy h()
    {
        return u;
    }

    public final ldh i()
    {
        return m;
    }

    public final lcy j()
    {
        return v;
    }

    public final lcy k()
    {
        return w;
    }

    public final ldh l()
    {
        return n;
    }

    public final lcy m()
    {
        return x;
    }

    public final lcy n()
    {
        return y;
    }

    public final ldh o()
    {
        return o;
    }

    public final lcy p()
    {
        return z;
    }

    public final lcy q()
    {
        return A;
    }

    public final lcy r()
    {
        return B;
    }

    public final ldh s()
    {
        return c;
    }

    public final lcy t()
    {
        return h;
    }

    public final lcy u()
    {
        return C;
    }

    public final lcy v()
    {
        return D;
    }

    public final ldh w()
    {
        return d;
    }

    public final lcy x()
    {
        return i;
    }

    public final ldh y()
    {
        return e;
    }

    public final lcy z()
    {
        return E;
    }
}
