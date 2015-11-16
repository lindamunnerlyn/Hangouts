// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class cws extends cvn
{

    private static final long serialVersionUID = 2L;
    private boolean A;
    private boolean B;
    private boolean C;
    private boolean D;
    private boolean E;
    private boolean F;
    private boolean G;
    private final boolean H;
    private final boolean I;
    private final long J;
    private List K;
    private String L[];
    private List M;
    private byte N[][];
    private final ceu g;
    private final czu h;
    private final int i;
    private Map j;
    private transient iwb k;
    private String l;
    private Integer m;
    private boolean n;
    private boolean o;
    private boolean p;
    private boolean q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private boolean y;
    private boolean z;

    private cws(iua iua1)
    {
        int i1;
        int l1;
        super(iua1.responseHeader, -1L);
        if (iua1.a == null)
        {
            break MISSING_BLOCK_LABEL_1297;
        }
        Object obj = iua1.a;
        g = g.a(((iss) (obj)), null);
        Object aobj[];
        if (((iss) (obj)).f != null)
        {
            h = new czu(((iss) (obj)).f, g.b(), System.currentTimeMillis());
        } else
        {
            h = null;
        }
        i = g.a(iua1.q, 0);
        p = g.a(Boolean.valueOf(g.o), false);
        obj = iua1.g;
        ebw.a("Babel", "parsePhoneVerificationStates.");
        j = new HashMap();
        aobj = ((iwb) (obj)).a;
        l1 = aobj.length;
        i1 = 0;
        while (i1 < l1) 
        {
            Object obj1 = aobj[i1];
            if (cvn.a)
            {
                String s3 = String.valueOf(ebw.b(((iwa) (obj1)).a.a));
                String s5 = String.valueOf(((iwa) (obj1)).c);
                ebw.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 32 + String.valueOf(s5).length())).append("phoneNumber=").append(s3).append(" verificationStatus=").append(s5).toString());
            }
            if (TextUtils.isEmpty(((iwa) (obj1)).a.a))
            {
                ebw.f("Babel", "skipping empty phone number");
            } else
            {
                obj1 = new cpy(((iwa) (obj1)));
                if (((cpy) (obj1)).b())
                {
                    j.put(((cpy) (obj1)).a(), obj1);
                }
            }
            i1++;
        }
        k = iua1.g;
        if (k.b != null)
        {
            N = new byte[k.b.length][];
            aobj = k.b;
            int j2 = aobj.length;
            i1 = 0;
            l1 = 0;
            for (; i1 < j2; i1++)
            {
                iqq iqq = aobj[i1];
                N[l1] = kop.toByteArray(iqq);
                l1++;
            }

        } else
        {
            N = new byte[0][];
        }
        w = g.a(Boolean.valueOf(g.u), false);
        x = g.a(Boolean.valueOf(g.v), false);
        M = new ArrayList(iua1.s.length);
        aobj = iua1.s;
        l1 = aobj.length;
        for (i1 = 0; i1 < l1; i1++)
        {
            itf itf = aobj[i1];
            M.add(new crl(itf));
        }

        l1 = iua1.h.length;
        if (cvn.a)
        {
            String s1 = String.valueOf("GetSelfInfoResponse bitCount status: ");
            ebw.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(l1).toString());
        }
        i1 = 0;
_L20:
        iqx iqx1;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_1076;
        }
        iqx1 = iua1.h[i1];
        if (cvn.a)
        {
            String s2 = String.valueOf("GetSelfInfoResponse configBit: ");
            String s4 = String.valueOf(iqx1.a);
            String s6 = String.valueOf(iqx1.b);
            ebw.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 3 + String.valueOf(s4).length() + String.valueOf(s6).length())).append(s2).append(s4).append(" : ").append(s6).toString());
        }
        g.a(iqx1.a, 0);
        JVM INSTR tableswitch 2 33: default 812
    //                   2 821
    //                   3 812
    //                   4 812
    //                   5 836
    //                   6 866
    //                   7 812
    //                   8 812
    //                   9 812
    //                   10 812
    //                   11 812
    //                   12 896
    //                   13 911
    //                   14 926
    //                   15 941
    //                   16 971
    //                   17 956
    //                   18 812
    //                   19 881
    //                   20 812
    //                   21 812
    //                   22 812
    //                   23 812
    //                   24 1001
    //                   25 851
    //                   26 851
    //                   27 986
    //                   28 1016
    //                   29 1031
    //                   30 812
    //                   31 1046
    //                   32 812
    //                   33 1061;
           goto _L1 _L2 _L1 _L1 _L3 _L4 _L1 _L1 _L1 _L1 _L1 _L5 _L6 _L7 _L8 _L9 _L10 _L1 _L11 _L1 _L1 _L1 _L1 _L12 _L13 _L13 _L14 _L15 _L16 _L1 _L17 _L1 _L18
_L18:
        break MISSING_BLOCK_LABEL_1061;
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L21:
        i1++;
        if (true) goto _L20; else goto _L19
_L19:
        n = g.a(iqx1.b, false);
          goto _L21
_L3:
        o = g.a(iqx1.b, false);
          goto _L21
_L13:
        q = g.a(iqx1.b, false);
          goto _L21
_L4:
        r = g.a(iqx1.b, false);
          goto _L21
_L11:
        s = g.a(iqx1.b, false);
          goto _L21
_L5:
        t = g.a(iqx1.b, false);
          goto _L21
_L6:
        u = g.a(iqx1.b, false);
          goto _L21
_L7:
        v = g.a(iqx1.b, false);
          goto _L21
_L8:
        y = g.a(iqx1.b, false);
          goto _L21
_L10:
        z = g.a(iqx1.b, false);
          goto _L21
_L9:
        A = g.a(iqx1.b, false);
          goto _L21
_L14:
        B = g.a(iqx1.b, false);
          goto _L21
_L12:
        C = g.a(iqx1.b, false);
          goto _L21
_L15:
        D = g.a(iqx1.b, false);
          goto _L21
_L16:
        E = g.a(iqx1.b, false);
          goto _L21
_L17:
        F = g.a(iqx1.b, false);
          goto _L21
        G = g.a(iqx1.b, false);
          goto _L21
        ixj ixj1;
        boolean flag;
        if (iua1.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        H = flag;
        if (H)
        {
            I = g.a(iua1.d.a, false);
            J = g.a(iua1.d.b, 0L);
        } else
        {
            I = false;
            J = 0L;
        }
        ixj1 = iua1.l;
        if (ixj1 != null && ixj1.c.length > 0)
        {
            K = new ArrayList(ixj1.c.length);
            ixh aixh[] = ixj1.c;
            int i2 = aixh.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                ixh ixh1 = aixh[j1];
                K.add(new ebj(ixh1.a, ixh1.b));
            }

        }
        if (iua1.p != null)
        {
            L = new String[iua1.p.length];
            for (int k1 = 0; k1 < iua1.p.length; k1++)
            {
                L[k1] = iua1.p[k1].b;
            }

        }
        break MISSING_BLOCK_LABEL_1337;
        g = null;
        h = null;
        i = 0;
        j = null;
        k = null;
        H = false;
        I = false;
        J = 0L;
        jti jti1 = iua1.r;
        if (jti1 != null)
        {
            l = jti1.a;
            m = Integer.valueOf(g.a(jti1.b, 0));
            ebz.a(l, m);
        }
        if (cvn.a)
        {
            iua1 = String.valueOf(iua1);
            ebw.b("Babel_protos", (new StringBuilder(String.valueOf(iua1).length() + 25)).append("GetSelfInfoResponse from:").append(iua1).toString());
        }
        return;
    }

    public static cvn parseFrom(iua iua1)
    {
        if (a(iua1.responseHeader))
        {
            return new cvz(iua1.responseHeader);
        } else
        {
            return new cws(iua1);
        }
    }

    public static cvn parseFrom(byte abyte0[])
    {
        return parseFrom((iua)kop.mergeFrom(new iua(), abyte0));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        k = (iwb)kop.mergeFrom(new iwb(), (byte[])objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(kop.toByteArray(k));
    }

    public ceu k()
    {
        return g;
    }

    public Map l()
    {
        return j;
    }

    public byte[][] m()
    {
        return N;
    }

    public anj n()
    {
        anj anj1 = new anj();
        anj1.a = i;
        anj1.b = n;
        anj1.c = o;
        anj1.i = p;
        anj1.d = q;
        anj1.e = r;
        anj1.o = s;
        anj1.f = t;
        anj1.g = v;
        anj1.h = u;
        anj1.j = w;
        anj1.k = x;
        anj1.l = y;
        anj1.m = z;
        anj1.n = A;
        anj1.p = B;
        anj1.q = C;
        anj1.r = D;
        anj1.s = E;
        anj1.u = l;
        anj1.v = m;
        anj1.w = F;
        anj1.t = G;
        anj1.x = M;
        return anj1;
    }

    public boolean o()
    {
        return I;
    }

    public long p()
    {
        return J;
    }

    public List q()
    {
        return K;
    }

    public String[] r()
    {
        return L;
    }

    public List s()
    {
        return M;
    }
}
