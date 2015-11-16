// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class dbq
    implements amo, bvs, ddm
{

    private static final crl A;
    private static final crl B;
    private static final crl C;
    private static final crl D;
    private static final crl E;
    private static final crl F;
    private static final crl G;
    private static final crl H;
    private static final crl I;
    private static final crl J;
    private static final crl K;
    private static final crl L;
    private static final crl M;
    private static final crl N;
    private static final crl O;
    private static final crl P;
    private static final crl Q;
    private static final crl R;
    private static final crl S;
    private static final crl T;
    private static final crl U[];
    private static final crl a;
    private static final crl b;
    private static final crl c;
    private static final crl d;
    private static final crl e;
    private static final crl f;
    private static final crl g;
    private static final crl h;
    private static final crl i;
    private static final crl j;
    private static final crl k;
    private static final crl l;
    private static final crl m;
    private static final crl n;
    private static final crl o;
    private static final crl p;
    private static final crl q;
    private static final crl r;
    private static final crl s;
    private static final crl t;
    private static final crl u;
    private static final crl v;
    private static final crl w;
    private static final crl x;
    private static final crl y;
    private static final crl z;
    private final Context V;

    dbq(Context context)
    {
        V = context;
    }

    public static boolean A(int i1)
    {
        return I.a(i1);
    }

    public static boolean B(int i1)
    {
        return J.a(i1);
    }

    public static boolean C(int i1)
    {
        return L.a(i1);
    }

    public static boolean D(int i1)
    {
        return K.a(i1);
    }

    public static boolean E(int i1)
    {
        return N.a(i1);
    }

    public static boolean F(int i1)
    {
        return O.a(i1);
    }

    public static boolean G(int i1)
    {
        return P.a(i1);
    }

    public static boolean H(int i1)
    {
        return Q.a(i1);
    }

    public static boolean I(int i1)
    {
        return R.a(i1);
    }

    public static long J(int i1)
    {
        return S.b(i1);
    }

    public static float K(int i1)
    {
        return T.c(i1);
    }

    public static String L(int i1)
    {
        if (!((gms)hgx.a(g.nS, gms)).c(i1))
        {
            ebw.f("BabelExperiments", (new StringBuilder(61)).append("Getting experiment signatures for invalid account ").append(i1).toString());
            return "invalid_account";
        }
        StringBuilder stringbuilder = new StringBuilder();
        crl acrl[] = U;
        int k1 = acrl.length;
        int j1 = 0;
        while (j1 < k1) 
        {
            crl crl1 = acrl[j1];
            stringbuilder.append(crl1.b());
            stringbuilder.append(":");
            if (crl1.a() == 1)
            {
                stringbuilder.append(crl1.a(i1));
            } else
            if (crl1.a() == 2)
            {
                stringbuilder.append(crl1.b(i1));
            }
            stringbuilder.append(";");
            j1++;
        }
        return stringbuilder.toString();
    }

    public static String[] M(int i1)
    {
        Object obj = (gms)hgx.a(g.nS, gms);
        if (!((gms) (obj)).c(i1))
        {
            ebw.f("BabelExperiments", (new StringBuilder(60)).append("Getting loggable experiments for invalid account ").append(i1).toString());
            return new String[0];
        }
        obj = ((gms) (obj)).a(i1).b("loggable_experiments");
        if (obj == null)
        {
            return new String[0];
        } else
        {
            return ((String) (obj)).split(";");
        }
    }

    public static crl a(String s1)
    {
        crl acrl[] = U;
        int j1 = acrl.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            crl crl1 = acrl[i1];
            if (crl1.b().equals(s1))
            {
                return crl1;
            }
        }

        return null;
    }

    public static boolean a(int i1)
    {
        return f.a(i1);
    }

    private static boolean a(String s1, gmw gmw1, java.util.Map.Entry entry)
    {
        String s2 = (String)entry.getKey();
        if (s2 == null)
        {
            s1 = String.valueOf(entry.getValue());
            ebw.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 29)).append("Unexpected null key; value = ").append(s1).toString());
            return false;
        }
        if (s2.startsWith(s1))
        {
            s1 = s2.substring(s1.length());
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof Boolean)
            {
                gmw1.b(s1, g.a((Boolean)entry, false));
            } else
            if (entry instanceof Long)
            {
                gmw1.b(s1, g.a((Long)entry, 0L));
            } else
            {
                gmw1 = String.valueOf(entry);
                gbh.a((new StringBuilder(String.valueOf(gmw1).length() + 27 + String.valueOf(s1).length())).append("Unexpected babel exp: ").append(gmw1).append(" for ").append(s1).toString());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(int i1)
    {
        return h.a(i1);
    }

    public static boolean c(int i1)
    {
        return j.a(i1);
    }

    public static boolean d(int i1)
    {
        return k.a(i1);
    }

    public static boolean e(int i1)
    {
        return l.a(i1);
    }

    public static boolean f(int i1)
    {
        return m.a(i1);
    }

    public static boolean g(int i1)
    {
        return n.a(i1);
    }

    public static boolean h(int i1)
    {
        return o.a(i1);
    }

    public static boolean i(int i1)
    {
        return p.a(i1);
    }

    public static boolean j(int i1)
    {
        return q.a(i1);
    }

    public static boolean k(int i1)
    {
        return r.a(i1);
    }

    public static boolean l(int i1)
    {
        return s.a(i1) || t.a(i1);
    }

    public static boolean m(int i1)
    {
        return u.a(i1);
    }

    public static boolean n(int i1)
    {
        return v.a(i1);
    }

    public static boolean o(int i1)
    {
        return w.a(i1);
    }

    public static boolean p(int i1)
    {
        return x.a(i1);
    }

    public static boolean q(int i1)
    {
        return y.a(i1);
    }

    public static boolean r(int i1)
    {
        return z.a(i1);
    }

    public static boolean s(int i1)
    {
        return A.a(i1);
    }

    public static boolean t(int i1)
    {
        return B.a(i1);
    }

    public static boolean u(int i1)
    {
        return C.a(i1);
    }

    public static boolean v(int i1)
    {
        return D.a(i1);
    }

    public static boolean w(int i1)
    {
        return E.a(i1);
    }

    public static boolean x(int i1)
    {
        return F.a(i1);
    }

    public static boolean y(int i1)
    {
        return G.a(i1);
    }

    public static boolean z(int i1)
    {
        return H.a(i1);
    }

    public void a(Activity activity, Bundle bundle)
    {
        activity = L(((gmo)hgx.a(activity, gmo)).a());
        if (!TextUtils.isEmpty(activity))
        {
            bundle.putString("exp", activity);
        }
    }

    public void a(gmw gmw1, SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor)
    {
        gmw gmw2 = gmw1.g("babel_exp");
        gmw1 = gmw1.g("babel_exp_override");
        sharedpreferences = sharedpreferences.getAll().entrySet().iterator();
        do
        {
            if (!sharedpreferences.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)sharedpreferences.next();
            if (a("BABEL_EXP_", gmw2, entry) || a("OVERRIDE_BABEL_EXP_", gmw1, entry))
            {
                editor.remove((String)entry.getKey());
            }
        } while (true);
        editor.apply();
    }

    public void a(gmw gmw1, cws cws)
    {
        ArrayList arraylist;
        crl acrl[];
        int i1;
        int j1;
        int k1;
        j1 = ((gms)hgx.a(V, gms)).b(gmw1.b("account_name"), gmw1.b("effective_gaia_id"));
        if (j1 == -1)
        {
            ebw.f("BabelExperiments", (new StringBuilder(66)).append("Pre-computing loggable experiments for invalid account ").append(j1).toString());
            return;
        }
        arraylist = new ArrayList();
        acrl = U;
        k1 = acrl.length;
        i1 = 0;
_L9:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        crl crl1 = acrl[i1];
        if (!crl1.c()) goto _L4; else goto _L3
_L3:
        String s1 = String.valueOf(crl1.b()).concat(":");
        if (crl1.a() != 1) goto _L6; else goto _L5
_L5:
        s1 = String.valueOf(s1);
        if (crl1.a(j1))
        {
            cws = "1";
        } else
        {
            cws = "0";
        }
        cws = String.valueOf(cws);
        if (cws.length() != 0)
        {
            cws = s1.concat(cws);
        } else
        {
            cws = new String(s1);
        }
_L7:
        arraylist.add(cws);
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L6:
        cws = s1;
        if (crl1.a() == 2)
        {
            cws = String.valueOf(s1);
            long l1 = crl1.b(j1);
            cws = (new StringBuilder(String.valueOf(cws).length() + 20)).append(cws).append(l1).toString();
        }
        if (true) goto _L7; else goto _L2
_L2:
        gmw1.b("loggable_experiments", jgu.a(";").a(arraylist));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        a = new crl("cfd3274b", false);
        b = new crl("dd69e883", true);
        c = new crl("e32b87ce", false);
        d = new crl("648d1162", false);
        e = new crl("4ad97016", false);
        f = new crl("de9507e5", false);
        g = new crl("e830ee0f", false);
        h = new crl("28de1a65", false);
        i = new crl("638c9a45", false);
        j = new crl("715d526b", false);
        k = new crl("8376fb32", false);
        l = new crl("d2b8406d", false);
        m = new crl("5d18028f", false);
        n = new crl("50db251e", false);
        o = new crl("99c978d5", false);
        p = new crl("8ce9147e", false);
        q = new crl("79b46bfb", false);
        r = new crl("a42fee7f", false);
        s = new crl("1c54e739", false);
        t = new crl("fc4914c9", false);
        u = new crl("9ad373ab", false);
        v = new crl("c73b9df", false);
        w = new crl("3ed03b99", false);
        x = new crl("eeaee535", false);
        y = new crl("e245f4ed", false);
        z = new crl("da14d58e", false);
        A = new crl("b95a58f5", false);
        B = new crl("e6d0cdeb", false);
        C = new crl("fbeedada", false);
        D = new crl("ceb85578", false);
        E = new crl("d11d3e38", false);
        F = new crl("257d4381", false);
        G = new crl("c86b39d9", true);
        H = new crl("1e345451", false);
        I = new crl("4bed6341", false);
        J = new crl("71c5ac2a", false);
        K = new crl("878cf2ce", false);
        L = new crl("23dac235", false);
        M = new crl("6cd8df27", false);
        N = new crl("e357e93a", false);
        O = new crl("8c99a4b0", false);
        P = new crl("76e57aca", false);
        Q = new crl("752dd18b", false);
        R = new crl("677d41b1", false);
        S = new crl("ded386c3");
        T = new crl("dd8c17d9", (byte)0);
        U = (new crl[] {
            a, b, i, S, T, l, n, f, o, p, 
            g, s, t, q, r, w, x, d, e, D, 
            m, y, u, v, c, C, F, j, h, k, 
            G, H, I, z, B, J, K, L, M, N, 
            A, O, P, Q, R, E
        });
    }
}
