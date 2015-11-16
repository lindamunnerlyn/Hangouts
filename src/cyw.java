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

public final class cyw extends cxr
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
    private final cfz g;
    private final dba h;
    private final int i;
    private Map j;
    private transient jcg k;
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

    private cyw(jaf jaf1)
    {
        int i1;
        int l1;
        super(jaf1.responseHeader, -1L);
        if (jaf1.a == null)
        {
            break MISSING_BLOCK_LABEL_1297;
        }
        Object obj = jaf1.a;
        g = g.a(((iyx) (obj)), null);
        Object aobj[];
        if (((iyx) (obj)).f != null)
        {
            h = new dba(((iyx) (obj)).f, g.b(), System.currentTimeMillis());
        } else
        {
            h = null;
        }
        i = g.a(jaf1.q, 0);
        p = g.a(Boolean.valueOf(g.o), false);
        obj = jaf1.g;
        eev.a("Babel", "parsePhoneVerificationStates.");
        j = new HashMap();
        aobj = ((jcg) (obj)).a;
        l1 = aobj.length;
        i1 = 0;
        while (i1 < l1) 
        {
            Object obj1 = aobj[i1];
            if (cxr.a)
            {
                String s3 = String.valueOf(eev.b(((jcf) (obj1)).a.a));
                String s5 = String.valueOf(((jcf) (obj1)).c);
                eev.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 32 + String.valueOf(s5).length())).append("phoneNumber=").append(s3).append(" verificationStatus=").append(s5).toString());
            }
            if (TextUtils.isEmpty(((jcf) (obj1)).a.a))
            {
                eev.f("Babel", "skipping empty phone number");
            } else
            {
                obj1 = new crp(((jcf) (obj1)));
                if (((crp) (obj1)).b())
                {
                    j.put(((crp) (obj1)).a(), obj1);
                }
            }
            i1++;
        }
        k = jaf1.g;
        if (k.b != null)
        {
            N = new byte[k.b.length][];
            aobj = k.b;
            int j2 = aobj.length;
            i1 = 0;
            l1 = 0;
            for (; i1 < j2; i1++)
            {
                iwv iwv = aobj[i1];
                N[l1] = kws.toByteArray(iwv);
                l1++;
            }

        } else
        {
            N = new byte[0][];
        }
        w = g.a(Boolean.valueOf(g.u), false);
        x = g.a(Boolean.valueOf(g.v), false);
        M = new ArrayList(jaf1.s.length);
        aobj = jaf1.s;
        l1 = aobj.length;
        for (i1 = 0; i1 < l1; i1++)
        {
            izk izk = aobj[i1];
            M.add(new ctv(izk));
        }

        l1 = jaf1.h.length;
        if (cxr.a)
        {
            String s1 = String.valueOf("GetSelfInfoResponse bitCount status: ");
            eev.b("Babel", (new StringBuilder(String.valueOf(s1).length() + 11)).append(s1).append(l1).toString());
        }
        i1 = 0;
_L20:
        ixc ixc1;
        if (i1 >= l1)
        {
            break MISSING_BLOCK_LABEL_1076;
        }
        ixc1 = jaf1.h[i1];
        if (cxr.a)
        {
            String s2 = String.valueOf("GetSelfInfoResponse configBit: ");
            String s4 = String.valueOf(ixc1.a);
            String s6 = String.valueOf(ixc1.b);
            eev.b("Babel", (new StringBuilder(String.valueOf(s2).length() + 3 + String.valueOf(s4).length() + String.valueOf(s6).length())).append(s2).append(s4).append(" : ").append(s6).toString());
        }
        g.a(ixc1.a, 0);
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
        n = g.a(ixc1.b, false);
          goto _L21
_L3:
        o = g.a(ixc1.b, false);
          goto _L21
_L13:
        q = g.a(ixc1.b, false);
          goto _L21
_L4:
        r = g.a(ixc1.b, false);
          goto _L21
_L11:
        s = g.a(ixc1.b, false);
          goto _L21
_L5:
        t = g.a(ixc1.b, false);
          goto _L21
_L6:
        u = g.a(ixc1.b, false);
          goto _L21
_L7:
        v = g.a(ixc1.b, false);
          goto _L21
_L8:
        y = g.a(ixc1.b, false);
          goto _L21
_L10:
        z = g.a(ixc1.b, false);
          goto _L21
_L9:
        A = g.a(ixc1.b, false);
          goto _L21
_L14:
        B = g.a(ixc1.b, false);
          goto _L21
_L12:
        C = g.a(ixc1.b, false);
          goto _L21
_L15:
        D = g.a(ixc1.b, false);
          goto _L21
_L16:
        E = g.a(ixc1.b, false);
          goto _L21
_L17:
        F = g.a(ixc1.b, false);
          goto _L21
        G = g.a(ixc1.b, false);
          goto _L21
        jdo jdo1;
        boolean flag;
        if (jaf1.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        H = flag;
        if (H)
        {
            I = g.a(jaf1.d.a, false);
            J = g.a(jaf1.d.b, 0L);
        } else
        {
            I = false;
            J = 0L;
        }
        jdo1 = jaf1.l;
        if (jdo1 != null && jdo1.c.length > 0)
        {
            K = new ArrayList(jdo1.c.length);
            jdm ajdm[] = jdo1.c;
            int i2 = ajdm.length;
            for (int j1 = 0; j1 < i2; j1++)
            {
                jdm jdm1 = ajdm[j1];
                K.add(new eeh(jdm1.a, jdm1.b));
            }

        }
        if (jaf1.p != null)
        {
            L = new String[jaf1.p.length];
            for (int k1 = 0; k1 < jaf1.p.length; k1++)
            {
                L[k1] = jaf1.p[k1].b;
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
        kbl kbl1 = jaf1.r;
        if (kbl1 != null)
        {
            l = kbl1.a;
            m = Integer.valueOf(g.a(kbl1.b, 0));
            eey.a(l, m);
        }
        if (cxr.a)
        {
            jaf1 = String.valueOf(jaf1);
            eev.b("Babel_protos", (new StringBuilder(String.valueOf(jaf1).length() + 25)).append("GetSelfInfoResponse from:").append(jaf1).toString());
        }
        return;
    }

    public static cxr parseFrom(jaf jaf1)
    {
        if (a(jaf1.responseHeader))
        {
            return new cyd(jaf1.responseHeader);
        } else
        {
            return new cyw(jaf1);
        }
    }

    public static cxr parseFrom(byte abyte0[])
    {
        return parseFrom((jaf)kws.mergeFrom(new jaf(), abyte0));
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        objectinputstream.defaultReadObject();
        k = (jcg)kws.mergeFrom(new jcg(), (byte[])objectinputstream.readObject());
    }

    private void writeObject(ObjectOutputStream objectoutputstream)
    {
        objectoutputstream.defaultWriteObject();
        objectoutputstream.writeObject(kws.toByteArray(k));
    }

    public cfz k()
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

    public aob n()
    {
        aob aob1 = new aob();
        aob1.a = i;
        aob1.b = n;
        aob1.c = o;
        aob1.i = p;
        aob1.d = q;
        aob1.e = r;
        aob1.o = s;
        aob1.f = t;
        aob1.g = v;
        aob1.h = u;
        aob1.j = w;
        aob1.k = x;
        aob1.l = y;
        aob1.m = z;
        aob1.n = A;
        aob1.p = B;
        aob1.q = C;
        aob1.r = D;
        aob1.s = E;
        aob1.u = l;
        aob1.v = m;
        aob1.w = F;
        aob1.t = G;
        aob1.x = M;
        return aob1;
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
