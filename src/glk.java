// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Externalizable;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.util.ArrayList;
import java.util.List;

public class glk
    implements Externalizable
{

    private static final long serialVersionUID = 1L;
    private boolean A;
    private glo B;
    private boolean C;
    private glo D;
    private boolean E;
    private glo F;
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
    private glo b;
    private boolean c;
    private glo d;
    private boolean e;
    private glo f;
    private boolean g;
    private glo h;
    private boolean i;
    private glo j;
    private boolean k;
    private glo l;
    private boolean m;
    private glo n;
    private boolean o;
    private glo p;
    private boolean q;
    private glo r;
    private boolean s;
    private glo t;
    private boolean u;
    private glo v;
    private boolean w;
    private glo x;
    private boolean y;
    private glo z;

    public glk()
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

    public static gll newBuilder()
    {
        return new gll();
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

    public glk a(int i1)
    {
        I = true;
        J = i1;
        return this;
    }

    public glk a(glo glo1)
    {
        a = true;
        b = glo1;
        return this;
    }

    public glk a(String s1)
    {
        G = true;
        H = s1;
        return this;
    }

    public glk a(boolean flag)
    {
        W = true;
        X = flag;
        return this;
    }

    public glo a()
    {
        return b;
    }

    public glk b(glo glo1)
    {
        c = true;
        d = glo1;
        return this;
    }

    public glk b(String s1)
    {
        K = true;
        L = s1;
        return this;
    }

    public glk b(boolean flag)
    {
        aa = true;
        ab = flag;
        return this;
    }

    public glo b()
    {
        return d;
    }

    public glk c(glo glo1)
    {
        e = true;
        f = glo1;
        return this;
    }

    public glk c(String s1)
    {
        M = true;
        N = s1;
        return this;
    }

    public glk c(boolean flag)
    {
        ae = true;
        af = flag;
        return this;
    }

    public glo c()
    {
        return f;
    }

    public glk d(glo glo1)
    {
        g = true;
        h = glo1;
        return this;
    }

    public glk d(String s1)
    {
        O = true;
        P = s1;
        return this;
    }

    public glk d(boolean flag)
    {
        ag = true;
        ah = flag;
        return this;
    }

    public glo d()
    {
        return h;
    }

    public glk e(glo glo1)
    {
        i = true;
        j = glo1;
        return this;
    }

    public glk e(String s1)
    {
        Q = true;
        R = s1;
        return this;
    }

    public glo e()
    {
        return j;
    }

    public glk f(glo glo1)
    {
        k = true;
        l = glo1;
        return this;
    }

    public glk f(String s1)
    {
        S = true;
        T = s1;
        return this;
    }

    public glo f()
    {
        return l;
    }

    public glk g(glo glo1)
    {
        m = true;
        n = glo1;
        return this;
    }

    public glk g(String s1)
    {
        U = true;
        V = s1;
        return this;
    }

    public glo g()
    {
        return n;
    }

    public glk h(glo glo1)
    {
        o = true;
        p = glo1;
        return this;
    }

    public glk h(String s1)
    {
        ac = true;
        ad = s1;
        return this;
    }

    public glo h()
    {
        return p;
    }

    public glk i(glo glo1)
    {
        q = true;
        r = glo1;
        return this;
    }

    public glo i()
    {
        return r;
    }

    public glk j(glo glo1)
    {
        s = true;
        t = glo1;
        return this;
    }

    public glo j()
    {
        return t;
    }

    public glk k(glo glo1)
    {
        u = true;
        v = glo1;
        return this;
    }

    public boolean k()
    {
        return u;
    }

    public glk l(glo glo1)
    {
        w = true;
        x = glo1;
        return this;
    }

    public glo l()
    {
        return v;
    }

    public glk m(glo glo1)
    {
        y = true;
        z = glo1;
        return this;
    }

    public glo m()
    {
        return x;
    }

    public int n()
    {
        return J;
    }

    public glk n(glo glo1)
    {
        A = true;
        B = glo1;
        return this;
    }

    public glk o(glo glo1)
    {
        C = true;
        D = glo1;
        return this;
    }

    public String o()
    {
        return L;
    }

    public glk p(glo glo1)
    {
        E = true;
        F = glo1;
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
            glo glo1 = new glo();
            glo1.readExternal(objectinput);
            a(glo1);
        }
        if (objectinput.readBoolean())
        {
            glo glo2 = new glo();
            glo2.readExternal(objectinput);
            b(glo2);
        }
        if (objectinput.readBoolean())
        {
            glo glo3 = new glo();
            glo3.readExternal(objectinput);
            c(glo3);
        }
        if (objectinput.readBoolean())
        {
            glo glo4 = new glo();
            glo4.readExternal(objectinput);
            d(glo4);
        }
        if (objectinput.readBoolean())
        {
            glo glo5 = new glo();
            glo5.readExternal(objectinput);
            e(glo5);
        }
        if (objectinput.readBoolean())
        {
            glo glo6 = new glo();
            glo6.readExternal(objectinput);
            f(glo6);
        }
        if (objectinput.readBoolean())
        {
            glo glo7 = new glo();
            glo7.readExternal(objectinput);
            g(glo7);
        }
        if (objectinput.readBoolean())
        {
            glo glo8 = new glo();
            glo8.readExternal(objectinput);
            h(glo8);
        }
        if (objectinput.readBoolean())
        {
            glo glo9 = new glo();
            glo9.readExternal(objectinput);
            i(glo9);
        }
        if (objectinput.readBoolean())
        {
            glo glo10 = new glo();
            glo10.readExternal(objectinput);
            j(glo10);
        }
        if (objectinput.readBoolean())
        {
            glo glo11 = new glo();
            glo11.readExternal(objectinput);
            k(glo11);
        }
        if (objectinput.readBoolean())
        {
            glo glo12 = new glo();
            glo12.readExternal(objectinput);
            l(glo12);
        }
        if (objectinput.readBoolean())
        {
            glo glo13 = new glo();
            glo13.readExternal(objectinput);
            m(glo13);
        }
        if (objectinput.readBoolean())
        {
            glo glo14 = new glo();
            glo14.readExternal(objectinput);
            n(glo14);
        }
        if (objectinput.readBoolean())
        {
            glo glo15 = new glo();
            glo15.readExternal(objectinput);
            o(glo15);
        }
        if (objectinput.readBoolean())
        {
            glo glo16 = new glo();
            glo16.readExternal(objectinput);
            p(glo16);
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
            gli gli1 = new gli();
            gli1.readExternal(objectinput);
            Y.add(gli1);
        }

        k1 = objectinput.readInt();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            gli gli2 = new gli();
            gli2.readExternal(objectinput);
            Z.add(gli2);
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
            ((gli)Y.get(i1)).writeExternal(objectoutput);
        }

        k1 = A();
        objectoutput.writeInt(k1);
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            ((gli)Z.get(j1)).writeExternal(objectoutput);
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
