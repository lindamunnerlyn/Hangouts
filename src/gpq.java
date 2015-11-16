// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class gpq
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean A;
    private gpu B;
    private boolean C;
    private gpu D;
    private boolean E;
    private gpu F;
    private boolean G;
    private String H;
    private boolean I;
    private int J;
    private boolean K;
    private String L;
    private boolean M;
    private String N;
    private boolean O;
    private String P;
    private boolean Q;
    private String R;
    private boolean S;
    private String T;
    private boolean U;
    private String V;
    private boolean W;
    private boolean X;
    private List Y;
    private List Z;
    private boolean a;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private String ad;
    private boolean ae;
    private boolean af;
    private boolean ag;
    private boolean ah;
    private gpu b;
    private boolean c;
    private gpu d;
    private boolean e;
    private gpu f;
    private boolean g;
    private gpu h;
    private boolean i;
    private gpu j;
    private boolean k;
    private gpu l;
    private boolean m;
    private gpu n;
    private boolean o;
    private gpu p;
    private boolean q;
    private gpu r;
    private boolean s;
    private gpu t;
    private boolean u;
    private gpu v;
    private boolean w;
    private gpu x;
    private boolean y;
    private gpu z;

    public gpq()
    {
        b = null;
        d = null;
        f = null;
        h = null;
        j = null;
        l = null;
        n = null;
        p = null;
        r = null;
        t = null;
        v = null;
        x = null;
        z = null;
        B = null;
        D = null;
        F = null;
        H = "";
        J = 0;
        L = "";
        N = "";
        P = "";
        R = "";
        T = "";
        V = "";
        X = false;
        Y = new ArrayList();
        Z = new ArrayList();
        ab = false;
        ad = "";
        af = false;
        ah = false;
    }

    public static gpr newBuilder()
    {
        return new gpr();
    }

    public int A()
    {
        return Z.size();
    }

    public boolean B()
    {
        return ac;
    }

    public String C()
    {
        return ad;
    }

    public gpq a(int i1)
    {
        I = true;
        J = i1;
        return this;
    }

    public gpq a(gpu gpu1)
    {
        a = true;
        b = gpu1;
        return this;
    }

    public gpq a(String s1)
    {
        G = true;
        H = s1;
        return this;
    }

    public gpq a(boolean flag)
    {
        W = true;
        X = flag;
        return this;
    }

    public gpu a()
    {
        return b;
    }

    public gpq b(gpu gpu1)
    {
        c = true;
        d = gpu1;
        return this;
    }

    public gpq b(String s1)
    {
        K = true;
        L = s1;
        return this;
    }

    public gpq b(boolean flag)
    {
        aa = true;
        ab = flag;
        return this;
    }

    public gpu b()
    {
        return d;
    }

    public gpq c(gpu gpu1)
    {
        e = true;
        f = gpu1;
        return this;
    }

    public gpq c(String s1)
    {
        M = true;
        N = s1;
        return this;
    }

    public gpq c(boolean flag)
    {
        ae = true;
        af = flag;
        return this;
    }

    public gpu c()
    {
        return f;
    }

    public gpq d(gpu gpu1)
    {
        g = true;
        h = gpu1;
        return this;
    }

    public gpq d(String s1)
    {
        O = true;
        P = s1;
        return this;
    }

    public gpq d(boolean flag)
    {
        ag = true;
        ah = flag;
        return this;
    }

    public gpu d()
    {
        return h;
    }

    public gpq e(gpu gpu1)
    {
        i = true;
        j = gpu1;
        return this;
    }

    public gpq e(String s1)
    {
        Q = true;
        R = s1;
        return this;
    }

    public gpu e()
    {
        return j;
    }

    public gpq f(gpu gpu1)
    {
        k = true;
        l = gpu1;
        return this;
    }

    public gpq f(String s1)
    {
        S = true;
        T = s1;
        return this;
    }

    public gpu f()
    {
        return l;
    }

    public gpq g(gpu gpu1)
    {
        m = true;
        n = gpu1;
        return this;
    }

    public gpq g(String s1)
    {
        U = true;
        V = s1;
        return this;
    }

    public gpu g()
    {
        return n;
    }

    public gpq h(gpu gpu1)
    {
        o = true;
        p = gpu1;
        return this;
    }

    public gpq h(String s1)
    {
        ac = true;
        ad = s1;
        return this;
    }

    public gpu h()
    {
        return p;
    }

    public gpq i(gpu gpu1)
    {
        q = true;
        r = gpu1;
        return this;
    }

    public gpu i()
    {
        return r;
    }

    public gpq j(gpu gpu1)
    {
        s = true;
        t = gpu1;
        return this;
    }

    public gpu j()
    {
        return t;
    }

    public gpq k(gpu gpu1)
    {
        u = true;
        v = gpu1;
        return this;
    }

    public boolean k()
    {
        return u;
    }

    public gpq l(gpu gpu1)
    {
        w = true;
        x = gpu1;
        return this;
    }

    public gpu l()
    {
        return v;
    }

    public gpq m(gpu gpu1)
    {
        y = true;
        z = gpu1;
        return this;
    }

    public gpu m()
    {
        return x;
    }

    public int n()
    {
        return J;
    }

    public gpq n(gpu gpu1)
    {
        A = true;
        B = gpu1;
        return this;
    }

    public gpq o(gpu gpu1)
    {
        C = true;
        D = gpu1;
        return this;
    }

    public String o()
    {
        return L;
    }

    public gpq p(gpu gpu1)
    {
        E = true;
        F = gpu1;
        return this;
    }

    public boolean p()
    {
        return O;
    }

    public String q()
    {
        return P;
    }

    public boolean r()
    {
        return Q;
    }

    public void readExternal(ObjectInput objectinput)
    {
        boolean flag = false;
        if (objectinput.readBoolean())
        {
            gpu gpu1 = new gpu();
            gpu1.readExternal(objectinput);
            a(gpu1);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu2 = new gpu();
            gpu2.readExternal(objectinput);
            b(gpu2);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu3 = new gpu();
            gpu3.readExternal(objectinput);
            c(gpu3);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu4 = new gpu();
            gpu4.readExternal(objectinput);
            d(gpu4);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu5 = new gpu();
            gpu5.readExternal(objectinput);
            e(gpu5);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu6 = new gpu();
            gpu6.readExternal(objectinput);
            f(gpu6);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu7 = new gpu();
            gpu7.readExternal(objectinput);
            g(gpu7);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu8 = new gpu();
            gpu8.readExternal(objectinput);
            h(gpu8);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu9 = new gpu();
            gpu9.readExternal(objectinput);
            i(gpu9);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu10 = new gpu();
            gpu10.readExternal(objectinput);
            j(gpu10);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu11 = new gpu();
            gpu11.readExternal(objectinput);
            k(gpu11);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu12 = new gpu();
            gpu12.readExternal(objectinput);
            l(gpu12);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu13 = new gpu();
            gpu13.readExternal(objectinput);
            m(gpu13);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu14 = new gpu();
            gpu14.readExternal(objectinput);
            n(gpu14);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu15 = new gpu();
            gpu15.readExternal(objectinput);
            o(gpu15);
        }
        if (objectinput.readBoolean())
        {
            gpu gpu16 = new gpu();
            gpu16.readExternal(objectinput);
            p(gpu16);
        }
        a(objectinput.readUTF());
        a(objectinput.readInt());
        b(objectinput.readUTF());
        if (objectinput.readBoolean())
        {
            c(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            d(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            e(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            f(objectinput.readUTF());
        }
        if (objectinput.readBoolean())
        {
            g(objectinput.readUTF());
        }
        a(objectinput.readBoolean());
        int k1 = objectinput.readInt();
        for (int i1 = 0; i1 < k1; i1++)
        {
            gpo gpo1 = new gpo();
            gpo1.readExternal(objectinput);
            Y.add(gpo1);
        }

        k1 = objectinput.readInt();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            gpo gpo2 = new gpo();
            gpo2.readExternal(objectinput);
            Z.add(gpo2);
        }

        b(objectinput.readBoolean());
        if (objectinput.readBoolean())
        {
            h(objectinput.readUTF());
        }
        c(objectinput.readBoolean());
        d(objectinput.readBoolean());
    }

    public String s()
    {
        return R;
    }

    public boolean t()
    {
        return S;
    }

    public String u()
    {
        return T;
    }

    public String v()
    {
        return V;
    }

    public boolean w()
    {
        return X;
    }

    public void writeExternal(ObjectOutput objectoutput)
    {
        boolean flag = false;
        objectoutput.writeBoolean(a);
        if (a)
        {
            b.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(c);
        if (c)
        {
            d.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(e);
        if (e)
        {
            f.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(g);
        if (g)
        {
            h.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(i);
        if (i)
        {
            j.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(k);
        if (k)
        {
            l.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(m);
        if (m)
        {
            n.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(o);
        if (o)
        {
            p.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(q);
        if (q)
        {
            r.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(s);
        if (s)
        {
            t.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(u);
        if (u)
        {
            v.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(w);
        if (w)
        {
            x.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(y);
        if (y)
        {
            z.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(A);
        if (A)
        {
            B.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(C);
        if (C)
        {
            D.writeExternal(objectoutput);
        }
        objectoutput.writeBoolean(E);
        if (E)
        {
            F.writeExternal(objectoutput);
        }
        objectoutput.writeUTF(H);
        objectoutput.writeInt(J);
        objectoutput.writeUTF(L);
        objectoutput.writeBoolean(M);
        if (M)
        {
            objectoutput.writeUTF(N);
        }
        objectoutput.writeBoolean(O);
        if (O)
        {
            objectoutput.writeUTF(P);
        }
        objectoutput.writeBoolean(Q);
        if (Q)
        {
            objectoutput.writeUTF(R);
        }
        objectoutput.writeBoolean(S);
        if (S)
        {
            objectoutput.writeUTF(T);
        }
        objectoutput.writeBoolean(U);
        if (U)
        {
            objectoutput.writeUTF(V);
        }
        objectoutput.writeBoolean(X);
        int k1 = y();
        objectoutput.writeInt(k1);
        for (int i1 = 0; i1 < k1; i1++)
        {
            ((gpo)Y.get(i1)).writeExternal(objectoutput);
        }

        k1 = A();
        objectoutput.writeInt(k1);
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            ((gpo)Z.get(j1)).writeExternal(objectoutput);
        }

        objectoutput.writeBoolean(ab);
        objectoutput.writeBoolean(ac);
        if (ac)
        {
            objectoutput.writeUTF(ad);
        }
        objectoutput.writeBoolean(af);
        objectoutput.writeBoolean(ah);
    }

    public List x()
    {
        return Y;
    }

    public int y()
    {
        return Y.size();
    }

    public List z()
    {
        return Z;
    }
}
