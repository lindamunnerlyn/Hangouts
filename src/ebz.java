// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellSignalStrength;
import android.telephony.PhoneNumberUtils;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class ebz
{

    private static final boolean a = false;
    private static final ecb b = new ecb();
    private static final Map c;
    private static int d = -1;
    private static String e;
    private static String f;
    private static Integer g;
    private static final gf h = gf.a();
    private static final glv i = glv.a();
    private static final gkv j = gkv.b();
    private static final Pattern k = Pattern.compile("^[\\p{L}\\p{M}].*$");
    private static final Pattern l = Pattern.compile("^\\+?[0-9. ()-]{4,30}$");
    private static final Set m = new HashSet();
    private static Map n;

    private static eby a(String s, String s1, boolean flag)
    {
        eby eby1;
label0:
        {
            if (s == null)
            {
                throw new gkp(gkq.b, "Number may not be null");
            }
            eby eby2 = (eby)b.a(s);
            if (eby2 != null && eby2.a(s1))
            {
                eby1 = eby2;
                if (eby2.b() == flag)
                {
                    break label0;
                }
            }
            eby1 = new eby(s, s1, flag);
            b.a(s, eby1);
        }
        return eby1;
    }

    public static String a(String s)
    {
        String s1;
        try
        {
            s1 = a(s, null, false).g();
        }
        catch (gkp gkp1)
        {
            if (a)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "getCountry: Not able to parse e164 number ".concat(s);
                } else
                {
                    s = new String("getCountry: Not able to parse e164 number ");
                }
                ebw.b("Babel", s);
            }
            return null;
        }
        return s1;
    }

    public static String a(String s, int i1)
    {
        if (TextUtils.isEmpty(s))
        {
            return g.nS.getResources().getString(g.qK);
        } else
        {
            return h.a(b(s, i1), gq.a);
        }
    }

    public static String a(String s, String s1)
    {
        String s2 = s;
        if (s != null)
        {
            s2 = s;
            if (s1 != null)
            {
                s1 = (String)n.get(s1);
                s2 = s;
                if (!TextUtils.isEmpty(s1))
                {
                    s2 = s.replaceFirst(Pattern.quote(s1), "");
                }
            }
        }
        return s2;
    }

    public static void a()
    {
        eby.a();
        gbi.a.a(b);
    }

    public static void a(String s, Integer integer)
    {
        f = s;
        g = integer;
        e = null;
        d = -1;
    }

    public static boolean a(Context context)
    {
        Object obj = (TelephonyManager)context.getSystemService("phone");
        if (obj == null || android.os.Build.VERSION.SDK_INT < 18) goto _L2; else goto _L1
_L1:
        if (!((chz)hgx.a(context, chz)).a("android.permission.ACCESS_COARSE_LOCATION")) goto _L4; else goto _L3
_L3:
        context = ((TelephonyManager) (obj)).getAllCellInfo();
        if (context == null) goto _L4; else goto _L5
_L5:
        obj = context.iterator();
_L11:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L6
_L6:
        context = (CellInfo)((Iterator) (obj)).next();
        if (!context.isRegistered())
        {
            continue; /* Loop/switch isn't completed */
        }
        boolean flag;
        if (context instanceof CellInfoLte)
        {
            context = ((CellInfoLte)context).getCellSignalStrength();
        } else
        if (context instanceof CellInfoGsm)
        {
            context = ((CellInfoGsm)context).getCellSignalStrength();
        } else
        if (context instanceof CellInfoCdma)
        {
            context = ((CellInfoCdma)context).getCellSignalStrength();
        } else
        if (context instanceof CellInfoWcdma)
        {
            context = ((CellInfoWcdma)context).getCellSignalStrength();
        } else
        {
            context = null;
        }
        if (context == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (context.getLevel() > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
_L7:
        if (flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        return false;
        if (true) goto _L9; else goto _L8
_L9:
        break MISSING_BLOCK_LABEL_101;
_L8:
        if (true) goto _L11; else goto _L10
_L10:
    }

    private static String b(String s, int i1)
    {
        if (s != null && s.length() >= 6) goto _L2; else goto _L1
_L1:
        String s1;
        return s;
_L2:
        if ((s1 = b(s, j())) == null) goto _L1; else goto _L3
_L3:
        s = a(s1, j(), false);
        eca.a[i1 - 1];
        JVM INSTR tableswitch 1 2: default 190
    //                   1 74
    //                   2 183;
           goto _L4 _L5 _L6
_L4:
        i1 = glf.b;
_L11:
        return s.a(i1);
_L5:
        int j1 = s.d().a();
        if (d <= 0) goto _L8; else goto _L7
_L7:
        i1 = d;
_L12:
        if (j1 != i1) goto _L10; else goto _L9
_L9:
        Integer integer;
        try
        {
            i1 = glf.c;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return s1;
        }
          goto _L11
_L8:
        if (!c())
        {
            break MISSING_BLOCK_LABEL_142;
        }
        integer = Integer.valueOf(j.e(j()));
        if (integer == null)
        {
            break MISSING_BLOCK_LABEL_142;
        }
        i1 = g.a(integer, 0);
        d = i1;
          goto _L12
label0:
        {
            if (g == null)
            {
                break label0;
            }
            i1 = g.a(g, 0);
        }
          goto _L12
        if (a)
        {
            ebw.b("Babel", "unable to determine user's phone country code");
        }
        break MISSING_BLOCK_LABEL_196;
_L10:
        i1 = glf.b;
          goto _L11
_L6:
        i1 = glf.c;
          goto _L11
        i1 = 1;
          goto _L12
    }

    public static String b(String s, String s1)
    {
        eby eby1;
        eby1 = a(a(s, s1), s1, false);
        if (eby1.e())
        {
            return eby1.a(glf.a);
        }
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        if (!s1.equals(Locale.US.getCountry()) || !i.a(eby1.d(), s1)) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        s1 = eby1.a(glf.a);
        iterator = m.iterator();
_L6:
        if (!iterator.hasNext()) goto _L4; else goto _L3
_L3:
        if (!s1.startsWith((String)iterator.next())) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L7:
        if (!flag)
        {
            break; /* Loop/switch isn't completed */
        }
        try
        {
            s1 = eby1.a(glf.a);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (a)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "toValidGvE164Number: Not able to parse phone number ".concat(s);
                } else
                {
                    s = new String("toValidGvE164Number: Not able to parse phone number ");
                }
                ebw.b("Babel", s);
            }
            return null;
        }
        return s1;
_L4:
        flag = false;
        if (true) goto _L7; else goto _L2
_L2:
        return null;
    }

    public static boolean b()
    {
        return m().getPhoneType() != 0;
    }

    public static boolean b(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context != null)
        {
            context = context.getActiveNetworkInfo();
            return context != null && context.isConnected();
        } else
        {
            return false;
        }
    }

    public static boolean b(String s)
    {
        s = a(s);
        return s == null || s.equals("US") || s.equals("CA");
    }

    public static void c(String s, String s1)
    {
        n.put(s, s1);
    }

    public static boolean c()
    {
        int i1 = m().getSimState();
        if (a)
        {
            ebw.b("Babel", (new StringBuilder(50)).append("telephonyManager.getSimState() returns:").append(i1).toString());
        }
        return i1 != 1;
    }

    public static boolean c(String s)
    {
        if (s == null)
        {
            return false;
        } else
        {
            return f(s, j());
        }
    }

    public static String d(String s)
    {
        String s1 = j();
        if (f(s, s1))
        {
            return s;
        }
        if (s != null && s1 != null)
        {
            s1 = (String)n.get(s1);
            if (!TextUtils.isEmpty(s1))
            {
                s1 = String.valueOf(s1);
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    return s1.concat(s);
                } else
                {
                    return new String(s1);
                }
            }
        }
        return null;
    }

    public static boolean d()
    {
        if (android.os.Build.VERSION.SDK_INT >= 21)
        {
            return m().isSmsCapable();
        } else
        {
            return b();
        }
    }

    public static boolean d(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        }
        if (PhoneNumberUtils.isEmergencyNumber(s))
        {
            return true;
        }
        Object obj;
        String s2;
        try
        {
            obj = a(s, s1, false);
            s2 = Long.toString(((eby) (obj)).d().b());
            obj = ((eby) (obj)).g();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (a)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "isPotentialEmergencyNumber: Not able to parse phone number ".concat(s);
                } else
                {
                    s = new String("isPotentialEmergencyNumber: Not able to parse phone number ");
                }
                ebw.b("Babel", s);
            }
            return false;
        }
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            s1 = ((String) (obj));
        }
        return i.a(s2, s1) && i.b(s2, s1);
    }

    public static boolean e()
    {
        return b();
    }

    public static boolean e(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return false;
        } else
        {
            return l.matcher(s).matches();
        }
    }

    public static boolean e(String s, String s1)
    {
        String s2 = j();
        eby eby1;
        eby1 = a(s, s2, false);
        s1 = eby1.a(a(s1, s2, false));
        if (i.a(eby1.d(), s2)) goto _L2; else goto _L1
_L1:
        if (!s2.equals("US"))
        {
            break MISSING_BLOCK_LABEL_139;
        }
        boolean flag;
        if (s.startsWith("+1"))
        {
            if (s.length() == 10)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        } else
        {
            try
            {
                if (s.length() != 8)
                {
                    break MISSING_BLOCK_LABEL_139;
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return false;
            }
            flag = true;
        }
          goto _L3
_L2:
        if (s1 == gle.e)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L5:
        if (s1 == gle.e || s1 == gle.d)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        s = gle.c;
        if (s1 != s)
        {
            break; /* Loop/switch isn't completed */
        }
        return true;
_L3:
        if (!flag) goto _L5; else goto _L4
_L4:
        if (true) goto _L2; else goto _L6
_L6:
        return false;
        flag = false;
          goto _L3
    }

    public static String f(String s)
    {
        if (s == null)
        {
            return null;
        }
        String s1;
        if (s.startsWith("+"))
        {
            s1 = "+";
        } else
        {
            s1 = "";
        }
        s1 = String.valueOf(s1);
        s = String.valueOf(s.replaceAll("[^0-9]", ""));
        if (s.length() != 0)
        {
            return s1.concat(s);
        } else
        {
            return new String(s1);
        }
    }

    public static boolean f()
    {
        return d() && c();
    }

    private static boolean f(String s, String s1)
    {
        if (s == null)
        {
            return false;
        }
        s1 = (String)n.get(s1);
        if (TextUtils.isEmpty(s1))
        {
            return false;
        } else
        {
            return s.startsWith(s1);
        }
    }

    public static String g()
    {
        String s = h();
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return b(s, k());
        }
    }

    public static String g(String s)
    {
        return b(s, j());
    }

    private static String g(String s, String s1)
    {
        if (s != null) goto _L2; else goto _L1
_L1:
        s1 = null;
_L6:
        return s1;
_L2:
        String s2;
        Object obj;
        s2 = s.trim();
        if (s2 != null && s2.length() >= 3 && s2.charAt(0) == '*' && Character.isDigit(s2.charAt(1)) && Character.isDigit(s2.charAt(2)))
        {
            s = s2.substring(0, 3);
        } else
        {
            s = "";
        }
        obj = s2.substring(s.length()).trim();
        if (!TextUtils.isEmpty(((CharSequence) (obj)))) goto _L4; else goto _L3
_L3:
        s1 = s;
        if (!TextUtils.isEmpty(s)) goto _L6; else goto _L5
_L5:
        return null;
_L4:
        obj = a(((String) (obj)), s1, false);
        if (!((eby) (obj)).e()) goto _L8; else goto _L7
_L7:
        s = String.valueOf(s);
        s1 = String.valueOf(((eby) (obj)).a(glf.a));
        if (s1.length() != 0)
        {
            return s.concat(s1);
        }
        s = new String(s);
        return s;
        s;
        if (a)
        {
            s = String.valueOf(s2);
            if (s.length() != 0)
            {
                s = "Unable to parse phone number ".concat(s);
            } else
            {
                s = new String("Unable to parse phone number ");
            }
            ebw.b("Babel", s);
        }
_L10:
        if (true) goto _L5; else goto _L8
_L8:
        if (!i.a(((eby) (obj)).d(), s1)) goto _L10; else goto _L9
_L9:
        s = String.valueOf(s);
        s1 = String.valueOf(((eby) (obj)).a(glf.c));
        if (s1.length() != 0)
        {
            return s.concat(s1);
        }
        s = new String(s);
        return s;
    }

    public static String h()
    {
        if (i())
        {
            return m().getLine1Number();
        } else
        {
            return null;
        }
    }

    public static String h(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i1 = 0; i1 < s.length(); i1++)
        {
            int j1 = Character.digit(s.charAt(i1), 10);
            if (j1 != -1)
            {
                stringbuilder.append(j1);
            }
        }

        return stringbuilder.toString();
    }

    private static String h(String s, String s1)
    {
        eby eby1;
        String s2;
        int i1;
        try
        {
            eby1 = a(s, s1, false);
            if (eby1.e())
            {
                return eby1.a(glf.a);
            }
            s2 = String.valueOf(eby1.f());
            i1 = s2.length();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            if (a)
            {
                s = String.valueOf(s);
                if (s.length() != 0)
                {
                    s = "Not able to parse phone number ".concat(s);
                } else
                {
                    s = new String("Not able to parse phone number ");
                }
                ebw.b("Babel", s);
            }
            return null;
        }
        if (i1 < 2 || i1 > 18)
        {
            break MISSING_BLOCK_LABEL_129;
        }
        s1 = String.format("+%s%s", new Object[] {
            String.valueOf(eby1.b(s1)), s2
        });
        return s1;
        return null;
    }

    public static void i(String s)
    {
        m.add(s);
    }

    public static boolean i()
    {
        chz chz1 = (chz)hgx.a(g.nS, chz);
        return chz1.a("android.permission.READ_PHONE_STATE") || chz1.a("android.permission.READ_SMS");
    }

    public static String j()
    {
        if (!TextUtils.isEmpty(e))
        {
            return e;
        }
        if (c())
        {
            String s = k();
            if (!TextUtils.isEmpty(s))
            {
                e = s;
                return s;
            }
        }
        if (!TextUtils.isEmpty(f))
        {
            return f;
        }
        if (!TextUtils.isEmpty(Locale.getDefault().getCountry()))
        {
            return Locale.getDefault().getCountry();
        }
        if (a)
        {
            ebw.b("Babel", "unable to determine user's phone region code");
        }
        return "US";
    }

    public static boolean j(String s)
    {
        return d(s, j());
    }

    public static String k()
    {
        String s = m().getSimCountryIso();
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return s.toUpperCase(Locale.US);
        }
    }

    public static String k(String s)
    {
        return l(s);
    }

    public static String l()
    {
        return m().getSimOperator();
    }

    public static String l(String s)
    {
        String s3 = j();
        String s1 = b(s, s3);
        if (s1 != null)
        {
            s = s1;
        } else
        {
            String s2 = h(s, s3);
            if (s2 != null)
            {
                return s2;
            }
        }
        return s;
    }

    private static TelephonyManager m()
    {
        return (TelephonyManager)g.nS.getSystemService("phone");
    }

    public static String m(String s)
    {
        return g(s, j());
    }

    public static String n(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j1 = s.length();
        for (int i1 = 0; i1 < j1; i1++)
        {
            char c1 = s.charAt(i1);
            if (Character.isDigit(c1))
            {
                stringbuilder.append(c1);
            }
        }

        return stringbuilder.substring(Math.max(0, stringbuilder.length() - 6));
    }

    public static String o(String s)
    {
        return p(s).replaceAll("\\s", "\\\240");
    }

    public static String p(String s)
    {
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        Object obj = g.nS.getResources().getString(g.qK);
_L4:
        return ((String) (obj));
_L2:
        if (s == null)
        {
            break; /* Loop/switch isn't completed */
        }
        obj = s;
        if (k.matcher(s).matches()) goto _L4; else goto _L3
_L3:
        eby eby1 = a(l(s), null, c(s));
        if (!eby1.c()) goto _L6; else goto _L5
_L5:
        int i1 = glf.c;
_L13:
        String s1 = a(eby1.a(i1), ecc.a);
        obj = s1;
        if (!eby1.b()) goto _L8; else goto _L7
_L7:
        obj = String.valueOf(s1);
        if (((String) (obj)).length() == 0) goto _L10; else goto _L9
_L9:
        obj = " ".concat(((String) (obj)));
_L11:
        obj = d(((String) (obj)));
          goto _L8
_L6:
        try
        {
            i1 = glf.a;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            obj = String.valueOf(((gkp) (obj)).getMessage());
            ebw.a("Babel", (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(obj).length())).append("Failed to parse '").append(s).append("' into PhoneInfo: ").append(((String) (obj))).toString());
            return a(s, ecc.a);
        }
        continue; /* Loop/switch isn't completed */
_L10:
        obj = new String(" ");
          goto _L11
_L8:
        return ((String) (obj));
        if (true) goto _L13; else goto _L12
_L12:
    }

    public static String q(String s)
    {
        Object obj = null;
        String s1 = obj;
        if (s != null)
        {
            s = a(s);
            s1 = obj;
            if (s != null)
            {
                s1 = (new Locale(Locale.getDefault().getLanguage(), s)).getDisplayCountry();
            }
        }
        return s1;
    }

    static 
    {
        Object obj = ebw.u;
        obj = new HashMap();
        n = ((Map) (obj));
        ((Map) (obj)).put(Locale.US.getCountry(), "*67");
        obj = new HashMap();
        ((Map) (obj)).put(Integer.valueOf(52), "1");
        ((Map) (obj)).put(Integer.valueOf(54), "9");
        c = Collections.unmodifiableMap(((Map) (obj)));
    }
}
