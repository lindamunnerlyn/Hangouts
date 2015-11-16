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

public class dcz
    implements ang, bwl, deu
{

    private static final ctv A;
    private static final ctv B;
    private static final ctv C;
    private static final ctv D;
    private static final ctv E;
    private static final ctv F;
    private static final ctv G;
    private static final ctv H;
    private static final ctv I;
    private static final ctv J;
    private static final ctv K;
    private static final ctv L;
    private static final ctv M;
    private static final ctv N;
    private static final ctv O;
    private static final ctv P;
    private static final ctv Q;
    private static final ctv R;
    private static final ctv S;
    private static final ctv T;
    private static final ctv U;
    private static final ctv V;
    private static final ctv W;
    private static final ctv X;
    private static final ctv Y;
    private static final ctv Z;
    public static final ctv a;
    private static final ctv aa;
    private static final ctv ab;
    private static final ctv ac;
    private static final ctv ad[];
    private static final ctv b;
    private static final ctv c;
    private static final ctv d;
    private static final ctv e;
    private static final ctv f;
    private static final ctv g;
    private static final ctv h;
    private static final ctv i;
    private static final ctv j;
    private static final ctv k;
    private static final ctv l;
    private static final ctv m;
    private static final ctv n;
    private static final ctv o;
    private static final ctv p;
    private static final ctv q;
    private static final ctv r;
    private static final ctv s;
    private static final ctv t;
    private static final ctv u;
    private static final ctv v;
    private static final ctv w;
    private static final ctv x;
    private static final ctv y;
    private static final ctv z;
    private final Context ae;

    dcz(Context context)
    {
        ae = context;
    }

    public static boolean A(int i1)
    {
        return K.a(i1);
    }

    public static boolean B(int i1)
    {
        return L.a(i1);
    }

    public static boolean C(int i1)
    {
        return M.a(i1);
    }

    public static boolean D(int i1)
    {
        return N.a(i1);
    }

    public static boolean E(int i1)
    {
        return P.a(i1);
    }

    public static boolean F(int i1)
    {
        return O.a(i1);
    }

    public static boolean G(int i1)
    {
        return R.a(i1);
    }

    public static boolean H(int i1)
    {
        return S.a(i1);
    }

    public static boolean I(int i1)
    {
        return T.a(i1);
    }

    public static boolean J(int i1)
    {
        return U.a(i1);
    }

    public static boolean K(int i1)
    {
        return V.a(i1);
    }

    public static boolean L(int i1)
    {
        return W.a(i1);
    }

    public static boolean M(int i1)
    {
        return X.a(i1);
    }

    public static long N(int i1)
    {
        return Y.b(i1);
    }

    public static boolean O(int i1)
    {
        return a.a(i1);
    }

    public static float P(int i1)
    {
        return Z.c(i1);
    }

    public static boolean Q(int i1)
    {
        return aa.a(i1);
    }

    public static String R(int i1)
    {
        if (!((gqz)hlp.a(g.nU, gqz)).c(i1))
        {
            eev.f("BabelExperiments", (new StringBuilder(61)).append("Getting experiment signatures for invalid account ").append(i1).toString());
            return "invalid_account";
        }
        StringBuilder stringbuilder = new StringBuilder();
        ctv actv[] = ad;
        int k1 = actv.length;
        int j1 = 0;
        while (j1 < k1) 
        {
            ctv ctv1 = actv[j1];
            stringbuilder.append(ctv1.b());
            stringbuilder.append(":");
            if (ctv1.a() == 1)
            {
                stringbuilder.append(ctv1.a(i1));
            } else
            if (ctv1.a() == 2)
            {
                stringbuilder.append(ctv1.b(i1));
            }
            stringbuilder.append(";");
            j1++;
        }
        return stringbuilder.toString();
    }

    public static String[] S(int i1)
    {
        Object obj = (gqz)hlp.a(g.nU, gqz);
        if (!((gqz) (obj)).c(i1))
        {
            eev.f("BabelExperiments", (new StringBuilder(60)).append("Getting loggable experiments for invalid account ").append(i1).toString());
            return new String[0];
        }
        obj = ((gqz) (obj)).a(i1).b("loggable_experiments");
        if (obj == null)
        {
            return new String[0];
        } else
        {
            return ((String) (obj)).split(";");
        }
    }

    public static ctv a(String s1)
    {
        ctv actv[] = ad;
        int j1 = actv.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            ctv ctv1 = actv[i1];
            if (ctv1.b().equals(s1))
            {
                return ctv1;
            }
        }

        return null;
    }

    public static boolean a(int i1)
    {
        return h.a(i1);
    }

    public static boolean a(Context context, int i1)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ab.a(i1))
        {
            flag = flag1;
            if (hlp.a(context, "80788cc0", false))
            {
                flag = true;
            }
        }
        return flag;
    }

    private static boolean a(String s1, grd grd1, java.util.Map.Entry entry)
    {
        String s2 = (String)entry.getKey();
        if (s2 == null)
        {
            s1 = String.valueOf(entry.getValue());
            eev.g("Babel", (new StringBuilder(String.valueOf(s1).length() + 29)).append("Unexpected null key; value = ").append(s1).toString());
            return false;
        }
        if (s2.startsWith(s1))
        {
            s1 = s2.substring(s1.length());
            entry = ((java.util.Map.Entry) (entry.getValue()));
            if (entry instanceof Boolean)
            {
                grd1.b(s1, g.a((Boolean)entry, false));
            } else
            if (entry instanceof Long)
            {
                grd1.b(s1, g.a((Long)entry, 0L));
            } else
            {
                grd1 = String.valueOf(entry);
                gdv.a((new StringBuilder(String.valueOf(grd1).length() + 27 + String.valueOf(s1).length())).append("Unexpected babel exp: ").append(grd1).append(" for ").append(s1).toString());
            }
            return true;
        } else
        {
            return false;
        }
    }

    public static boolean b(int i1)
    {
        return j.a(i1);
    }

    public static boolean c(int i1)
    {
        return l.a(i1);
    }

    public static boolean d(int i1)
    {
        return m.a(i1);
    }

    public static boolean e(int i1)
    {
        return n.a(i1);
    }

    public static boolean f(int i1)
    {
        return o.a(i1);
    }

    public static boolean g(int i1)
    {
        return p.a(i1);
    }

    public static boolean h(int i1)
    {
        return q.a(i1);
    }

    public static boolean i(int i1)
    {
        return r.a(i1);
    }

    public static long j(int i1)
    {
        return s.b(i1);
    }

    public static long k(int i1)
    {
        return t.b(i1);
    }

    public static long l(int i1)
    {
        return u.b(i1);
    }

    public static boolean m(int i1)
    {
        return v.a(i1);
    }

    public static boolean n(int i1)
    {
        return w.a(i1);
    }

    public static boolean o(int i1)
    {
        return x.a(i1) || y.a(i1);
    }

    public static boolean p(int i1)
    {
        return z.a(i1);
    }

    public static boolean q(int i1)
    {
        return A.a(i1);
    }

    public static boolean r(int i1)
    {
        return B.a(i1);
    }

    public static boolean s(int i1)
    {
        return C.a(i1);
    }

    public static boolean t(int i1)
    {
        return D.a(i1);
    }

    public static boolean u(int i1)
    {
        return E.a(i1);
    }

    public static boolean v(int i1)
    {
        return F.a(i1);
    }

    public static boolean w(int i1)
    {
        return G.a(i1);
    }

    public static boolean x(int i1)
    {
        return H.a(i1);
    }

    public static boolean y(int i1)
    {
        return I.a(i1);
    }

    public static boolean z(int i1)
    {
        return J.a(i1);
    }

    public void a(Activity activity, Bundle bundle)
    {
        activity = R(((gqu)hlp.a(activity, gqu)).a());
        if (!TextUtils.isEmpty(activity))
        {
            bundle.putString("exp", activity);
        }
    }

    public void a(grd grd1, SharedPreferences sharedpreferences, android.content.SharedPreferences.Editor editor)
    {
        grd grd2 = grd1.g("babel_exp");
        grd1 = grd1.g("babel_exp_override");
        sharedpreferences = sharedpreferences.getAll().entrySet().iterator();
        do
        {
            if (!sharedpreferences.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)sharedpreferences.next();
            if (a("BABEL_EXP_", grd2, entry) || a("OVERRIDE_BABEL_EXP_", grd1, entry))
            {
                editor.remove((String)entry.getKey());
            }
        } while (true);
        editor.apply();
    }

    public void a(grd grd1, cyw cyw)
    {
        ArrayList arraylist;
        ctv actv[];
        int i1;
        int j1;
        int k1;
        j1 = ((gqz)hlp.a(ae, gqz)).b(grd1.b("account_name"), grd1.b("effective_gaia_id"));
        if (j1 == -1)
        {
            eev.f("BabelExperiments", (new StringBuilder(66)).append("Pre-computing loggable experiments for invalid account ").append(j1).toString());
            return;
        }
        arraylist = new ArrayList();
        actv = ad;
        k1 = actv.length;
        i1 = 0;
_L9:
        if (i1 >= k1) goto _L2; else goto _L1
_L1:
        ctv ctv1 = actv[i1];
        if (!ctv1.c()) goto _L4; else goto _L3
_L3:
        String s1 = String.valueOf(ctv1.b()).concat(":");
        if (ctv1.a() != 1) goto _L6; else goto _L5
_L5:
        s1 = String.valueOf(s1);
        if (ctv1.a(j1))
        {
            cyw = "1";
        } else
        {
            cyw = "0";
        }
        cyw = String.valueOf(cyw);
        if (cyw.length() != 0)
        {
            cyw = s1.concat(cyw);
        } else
        {
            cyw = new String(s1);
        }
_L7:
        arraylist.add(cyw);
_L4:
        i1++;
        continue; /* Loop/switch isn't completed */
_L6:
        cyw = s1;
        if (ctv1.a() == 2)
        {
            cyw = String.valueOf(s1);
            long l1 = ctv1.b(j1);
            cyw = (new StringBuilder(String.valueOf(cyw).length() + 20)).append(cyw).append(l1).toString();
        }
        if (true) goto _L7; else goto _L2
_L2:
        grd1.b("loggable_experiments", jno.a(";").a(arraylist));
        return;
        if (true) goto _L9; else goto _L8
_L8:
    }

    static 
    {
        b = new ctv("cfd3274b", false);
        c = new ctv("dd69e883", true);
        d = new ctv("e32b87ce", false);
        e = new ctv("648d1162", false);
        f = new ctv("4ad97016", false);
        g = new ctv("93dbdb4d", false);
        h = new ctv("de9507e5", false);
        i = new ctv("e830ee0f", false);
        j = new ctv("28de1a65", false);
        k = new ctv("638c9a45", false);
        l = new ctv("715d526b", false);
        m = new ctv("8376fb32", false);
        n = new ctv("d2b8406d", false);
        o = new ctv("5d18028f", false);
        p = new ctv("50db251e", false);
        q = new ctv("99c978d5", false);
        r = new ctv("8ce9147e", false);
        s = new ctv("921c6ef1", 60000L);
        t = new ctv("92acc909", 1L);
        u = new ctv("740e8ae0", 0L);
        v = new ctv("79b46bfb", false);
        w = new ctv("a42fee7f", false);
        x = new ctv("1c54e739", false);
        y = new ctv("fc4914ca", false);
        z = new ctv("bf9b09ab", false);
        A = new ctv("3ed03b99", false);
        B = new ctv("eeaee535", false);
        C = new ctv("e245f4ed", false);
        D = new ctv("da14d58e", false);
        E = new ctv("b95a58f5", false);
        F = new ctv("e6d0cdeb", false);
        G = new ctv("54a237d", false);
        H = new ctv("ceb85578", false);
        I = new ctv("d11d3e38", false);
        J = new ctv("257d4381", false);
        K = new ctv("c86b39d9", true);
        L = new ctv("1e345451", false);
        M = new ctv("be12bbc2", false);
        N = new ctv("71c5ac2a", false);
        O = new ctv("878cf2ce", false);
        P = new ctv("23dac235", false);
        Q = new ctv("6cd8df27", false);
        R = new ctv("e357e93a", false);
        S = new ctv("cba54ff3", false);
        T = new ctv("1acd8b99", false);
        U = new ctv("752dd18b", false);
        V = new ctv("677d41b1", false);
        W = new ctv("40e50305", false);
        X = new ctv("4e10592b", false);
        Y = new ctv("ded386c3", 1000L);
        a = new ctv("9ebe31b8", false);
        Z = new ctv("dd8c17d9");
        aa = new ctv("173eb495", false);
        ab = new ctv("80788cc0", false);
        ac = new ctv("c639d94f", false);
        ad = (new ctv[] {
            k, Y, Z, u, b, c, n, p, N, R, 
            h, q, ac, aa, r, P, i, x, y, v, 
            w, W, X, D, F, S, T, U, V, A, 
            B, e, f, g, H, o, I, C, ab, Q, 
            z, G, d, O, J, E, l, M, s, t, 
            j, m, a, K, L
        });
    }
}
