// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.ObjectInputStream;

public abstract class log extends loi
{

    private static final long serialVersionUID = 0xa29fafd9a2b7b8f9L;
    private transient lni A;
    private transient lni B;
    private transient lni C;
    private transient lni D;
    private transient lni E;
    private transient lni F;
    private transient lni G;
    private transient lni H;
    private transient lni I;
    private transient lni J;
    private transient lni K;
    private transient int L;
    final lng a;
    final Object b;
    transient lnr c;
    transient lnr d;
    transient lnr e;
    transient lnr f;
    transient lnr g;
    transient lni h;
    transient lni i;
    transient lni j;
    private transient lnr k;
    private transient lnr l;
    private transient lnr m;
    private transient lnr n;
    private transient lnr o;
    private transient lnr p;
    private transient lnr q;
    private transient lni r;
    private transient lni s;
    private transient lni t;
    private transient lni u;
    private transient lni v;
    private transient lni w;
    private transient lni x;
    private transient lni y;
    private transient lni z;

    protected log(lng lng1, Object obj)
    {
        a = lng1;
        b = obj;
        L();
    }

    private void L()
    {
        boolean flag = false;
        int i1 = 0;
        loh loh1 = new loh();
        if (a != null)
        {
            loh1.a(a);
        }
        a(loh1);
        Object obj = loh1.a;
        if (obj == null)
        {
            obj = super.c();
        }
        k = ((lnr) (obj));
        obj = loh1.b;
        if (obj == null)
        {
            obj = super.f();
        }
        l = ((lnr) (obj));
        obj = loh1.c;
        if (obj == null)
        {
            obj = super.i();
        }
        m = ((lnr) (obj));
        obj = loh1.d;
        if (obj == null)
        {
            obj = super.l();
        }
        n = ((lnr) (obj));
        obj = loh1.e;
        if (obj == null)
        {
            obj = super.o();
        }
        o = ((lnr) (obj));
        obj = loh1.f;
        if (obj == null)
        {
            obj = super.s();
        }
        c = ((lnr) (obj));
        obj = loh1.g;
        if (obj == null)
        {
            obj = super.w();
        }
        d = ((lnr) (obj));
        obj = loh1.h;
        if (obj == null)
        {
            obj = super.y();
        }
        e = ((lnr) (obj));
        obj = loh1.i;
        if (obj == null)
        {
            obj = super.B();
        }
        f = ((lnr) (obj));
        obj = loh1.j;
        if (obj == null)
        {
            obj = super.D();
        }
        g = ((lnr) (obj));
        obj = loh1.k;
        if (obj == null)
        {
            obj = super.H();
        }
        p = ((lnr) (obj));
        obj = loh1.l;
        if (obj == null)
        {
            obj = super.J();
        }
        q = ((lnr) (obj));
        obj = loh1.m;
        if (obj == null)
        {
            obj = super.d();
        }
        r = ((lni) (obj));
        obj = loh1.n;
        if (obj == null)
        {
            obj = super.e();
        }
        s = ((lni) (obj));
        obj = loh1.o;
        if (obj == null)
        {
            obj = super.g();
        }
        t = ((lni) (obj));
        obj = loh1.p;
        if (obj == null)
        {
            obj = super.h();
        }
        u = ((lni) (obj));
        obj = loh1.q;
        if (obj == null)
        {
            obj = super.j();
        }
        v = ((lni) (obj));
        obj = loh1.r;
        if (obj == null)
        {
            obj = super.k();
        }
        w = ((lni) (obj));
        obj = loh1.s;
        if (obj == null)
        {
            obj = super.m();
        }
        x = ((lni) (obj));
        obj = loh1.t;
        if (obj == null)
        {
            obj = super.n();
        }
        y = ((lni) (obj));
        obj = loh1.u;
        if (obj == null)
        {
            obj = super.p();
        }
        z = ((lni) (obj));
        obj = loh1.v;
        if (obj == null)
        {
            obj = super.q();
        }
        A = ((lni) (obj));
        obj = loh1.w;
        if (obj == null)
        {
            obj = super.r();
        }
        B = ((lni) (obj));
        obj = loh1.x;
        if (obj == null)
        {
            obj = super.t();
        }
        h = ((lni) (obj));
        obj = loh1.y;
        if (obj == null)
        {
            obj = super.u();
        }
        C = ((lni) (obj));
        obj = loh1.z;
        if (obj == null)
        {
            obj = super.v();
        }
        D = ((lni) (obj));
        obj = loh1.A;
        if (obj == null)
        {
            obj = super.x();
        }
        i = ((lni) (obj));
        obj = loh1.B;
        if (obj == null)
        {
            obj = super.z();
        }
        E = ((lni) (obj));
        obj = loh1.C;
        if (obj == null)
        {
            obj = super.A();
        }
        F = ((lni) (obj));
        obj = loh1.D;
        if (obj == null)
        {
            obj = super.C();
        }
        G = ((lni) (obj));
        obj = loh1.E;
        if (obj == null)
        {
            obj = super.E();
        }
        j = ((lni) (obj));
        obj = loh1.F;
        if (obj == null)
        {
            obj = super.F();
        }
        H = ((lni) (obj));
        obj = loh1.G;
        if (obj == null)
        {
            obj = super.G();
        }
        I = ((lni) (obj));
        obj = loh1.H;
        if (obj == null)
        {
            obj = super.I();
        }
        J = ((lni) (obj));
        obj = loh1.I;
        if (obj == null)
        {
            obj = super.K();
        }
        K = ((lni) (obj));
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

    public final lni A()
    {
        return F;
    }

    public final lnr B()
    {
        return f;
    }

    public final lni C()
    {
        return G;
    }

    public final lnr D()
    {
        return g;
    }

    public final lni E()
    {
        return j;
    }

    public final lni F()
    {
        return H;
    }

    public final lni G()
    {
        return I;
    }

    public final lnr H()
    {
        return p;
    }

    public final lni I()
    {
        return J;
    }

    public final lnr J()
    {
        return q;
    }

    public final lni K()
    {
        return K;
    }

    public lnn a()
    {
        lng lng1 = a;
        if (lng1 != null)
        {
            return lng1.a();
        } else
        {
            return null;
        }
    }

    protected abstract void a(loh loh1);

    public final lnr c()
    {
        return k;
    }

    public final lni d()
    {
        return r;
    }

    public final lni e()
    {
        return s;
    }

    public final lnr f()
    {
        return l;
    }

    public final lni g()
    {
        return t;
    }

    public final lni h()
    {
        return u;
    }

    public final lnr i()
    {
        return m;
    }

    public final lni j()
    {
        return v;
    }

    public final lni k()
    {
        return w;
    }

    public final lnr l()
    {
        return n;
    }

    public final lni m()
    {
        return x;
    }

    public final lni n()
    {
        return y;
    }

    public final lnr o()
    {
        return o;
    }

    public final lni p()
    {
        return z;
    }

    public final lni q()
    {
        return A;
    }

    public final lni r()
    {
        return B;
    }

    public final lnr s()
    {
        return c;
    }

    public final lni t()
    {
        return h;
    }

    public final lni u()
    {
        return C;
    }

    public final lni v()
    {
        return D;
    }

    public final lnr w()
    {
        return d;
    }

    public final lni x()
    {
        return i;
    }

    public final lnr y()
    {
        return e;
    }

    public final lni z()
    {
        return E;
    }
}
