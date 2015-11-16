// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class gpb
{

    private static final Pattern A = Pattern.compile("\\(?\\$1\\)?");
    private static gpb B = null;
    static final gor a = new gor();
    static final Pattern b = Pattern.compile("[+\uFF0B]+");
    static final Pattern c = Pattern.compile("[\\\\/] *x");
    static final Pattern d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    static final String e = h("x\uFF58#\uFF03~\uFF5E");
    static final Pattern f = Pattern.compile("(\\D+)");
    private static final Logger g = Logger.getLogger(gpb.getName());
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final Map k;
    private static final Map l;
    private static final Pattern m = Pattern.compile("[\\d]+(?:[~\u2053\u223C\uFF5E][\\d]+)?");
    private static final String n;
    private static final Pattern o = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]+");
    private static final Pattern p = Pattern.compile("(\\p{Nd})");
    private static final Pattern q = Pattern.compile("[+\uFF0B\\p{Nd}]");
    private static final Pattern r = Pattern.compile("(?:.*?[A-Za-z]){3}.*");
    private static final String s;
    private static final String t;
    private static final Pattern u;
    private static final Pattern v;
    private static final Pattern w = Pattern.compile("(\\$\\d)");
    private static final Pattern x = Pattern.compile("\\$NP");
    private static final Pattern y = Pattern.compile("\\$FG");
    private static final Pattern z = Pattern.compile("\\$CC");
    private final got C;
    private final Map D;
    private final Set E = new HashSet(35);
    private final gpy F = new gpy(100);
    private final Set G = new HashSet(320);
    private final Set H = new HashSet();

    private gpb(got got1, Map map)
    {
        C = got1;
        D = map;
        for (got1 = map.entrySet().iterator(); got1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)got1.next();
            List list = (List)entry.getValue();
            if (list.size() == 1 && "001".equals(list.get(0)))
            {
                H.add(entry.getKey());
            } else
            {
                G.addAll(list);
            }
        }

        if (G.remove("001"))
        {
            g.log(Level.WARNING, "invalid metadata (country calling code was mapped to the non-geo entity as well as specific region(s))");
        }
        E.addAll((Collection)map.get(Integer.valueOf(1)));
    }

    private int a(String s1, gpq gpq1)
    {
        if (!b(s1, gpq1.a()))
        {
            return gpm.l;
        }
        if (b(s1, gpq1.e()))
        {
            return gpm.e;
        }
        if (b(s1, gpq1.d()))
        {
            return gpm.d;
        }
        if (b(s1, gpq1.f()))
        {
            return gpm.f;
        }
        if (b(s1, gpq1.h()))
        {
            return gpm.g;
        }
        if (b(s1, gpq1.g()))
        {
            return gpm.h;
        }
        if (b(s1, gpq1.i()))
        {
            return gpm.i;
        }
        if (b(s1, gpq1.j()))
        {
            return gpm.j;
        }
        if (b(s1, gpq1.m()))
        {
            return gpm.k;
        }
        if (b(s1, gpq1.b()))
        {
            if (gpq1.w())
            {
                return gpm.c;
            }
            if (b(s1, gpq1.c()))
            {
                return gpm.c;
            } else
            {
                return gpm.a;
            }
        }
        if (!gpq1.w() && b(s1, gpq1.c()))
        {
            return gpm.b;
        } else
        {
            return gpm.l;
        }
    }

    private static int a(Pattern pattern, String s1)
    {
        pattern = pattern.matcher(s1);
        if (pattern.matches())
        {
            return gpn.a;
        }
        if (pattern.lookingAt())
        {
            return gpn.d;
        } else
        {
            return gpn.c;
        }
    }

    private gpq a(int i1, String s1)
    {
        if ("001".equals(s1))
        {
            return a(i1);
        } else
        {
            return d(s1);
        }
    }

    private String a(gpw gpw1, List list)
    {
label0:
        {
            gpw1 = a(gpw1);
            list = list.iterator();
            String s1;
            gpq gpq1;
label1:
            do
            {
                do
                {
                    if (!list.hasNext())
                    {
                        break label0;
                    }
                    s1 = (String)list.next();
                    gpq1 = d(s1);
                    if (!gpq1.B())
                    {
                        continue label1;
                    }
                } while (!F.a(gpq1.C()).matcher(gpw1).lookingAt());
                return s1;
            } while (a(((String) (gpw1)), gpq1) == gpm.l);
            return s1;
        }
        return null;
    }

    static String a(String s1)
    {
        Object obj = q.matcher(s1);
        if (((Matcher) (obj)).find())
        {
            obj = s1.substring(((Matcher) (obj)).start());
            Object obj1 = d.matcher(((CharSequence) (obj)));
            s1 = ((String) (obj));
            if (((Matcher) (obj1)).find())
            {
                obj = ((String) (obj)).substring(0, ((Matcher) (obj1)).start());
                obj1 = g;
                Level level = Level.FINER;
                s1 = String.valueOf(obj);
                if (s1.length() != 0)
                {
                    s1 = "Stripped trailing characters: ".concat(s1);
                } else
                {
                    s1 = new String("Stripped trailing characters: ");
                }
                ((Logger) (obj1)).log(level, s1);
                s1 = ((String) (obj));
            }
            obj1 = c.matcher(s1);
            obj = s1;
            if (((Matcher) (obj1)).find())
            {
                obj = s1.substring(0, ((Matcher) (obj1)).start());
            }
            return ((String) (obj));
        } else
        {
            return "";
        }
    }

    private String a(String s1, gpo gpo1, int i1, String s2)
    {
        s2 = gpo1.b();
        s1 = F.a(gpo1.a()).matcher(s1);
        int j1 = gpl.c;
        gpo1 = gpo1.d();
        if (i1 == gpl.c && gpo1 != null && gpo1.length() > 0)
        {
            s1 = s1.replaceAll(w.matcher(s2).replaceFirst(gpo1));
        } else
        {
            s1 = s1.replaceAll(s2);
        }
        gpo1 = s1;
        if (i1 == gpl.d)
        {
            gpo1 = o.matcher(s1);
            if (gpo1.lookingAt())
            {
                s1 = gpo1.replaceFirst("");
            }
            gpo1 = gpo1.reset(s1).replaceAll("-");
        }
        return gpo1;
    }

    static StringBuilder a(String s1, boolean flag)
    {
        StringBuilder stringbuilder = new StringBuilder(s1.length());
        s1 = s1.toCharArray();
        int j1 = s1.length;
        int i1 = 0;
        while (i1 < j1) 
        {
            char c1 = s1[i1];
            int k1 = Character.digit(c1, 10);
            if (k1 != -1)
            {
                stringbuilder.append(k1);
            } else
            if (flag)
            {
                stringbuilder.append(c1);
            }
            i1++;
        }
        return stringbuilder;
    }

    private static void a(int i1, int j1, StringBuilder stringbuilder)
    {
        switch (gpc.b[j1 - 1])
        {
        default:
            return;

        case 1: // '\001'
            stringbuilder.insert(0, i1).insert(0, '+');
            return;

        case 2: // '\002'
            stringbuilder.insert(0, " ").insert(0, i1).insert(0, '+');
            return;

        case 3: // '\003'
            stringbuilder.insert(0, "-").insert(0, i1).insert(0, '+').insert(0, "tel:");
            break;
        }
    }

    private static void a(gpb gpb1)
    {
        gpb;
        JVM INSTR monitorenter ;
        B = gpb1;
        gpb;
        JVM INSTR monitorexit ;
        return;
        gpb1;
        throw gpb1;
    }

    private static void a(String s1, gpw gpw1)
    {
        if (s1.length() > 1 && s1.charAt(0) == '0')
        {
            gpw1.a(true);
            int i1;
            for (i1 = 1; i1 < s1.length() - 1 && s1.charAt(i1) == '0'; i1++) { }
            if (i1 != 1)
            {
                gpw1.b(i1);
            }
        }
    }

    private void a(String s1, String s2, boolean flag, boolean flag1, gpw gpw1)
    {
        boolean flag4 = false;
        if (s1 == null)
        {
            throw new gov(gow.b, "The phone number supplied was null.");
        }
        if (s1.length() > 250)
        {
            throw new gov(gow.e, "The string supplied was too long to parse.");
        }
        Object obj = new StringBuilder();
        int k1 = s1.indexOf(";phone-context=");
        if (k1 > 0)
        {
            int i1 = k1 + 15;
            if (s1.charAt(i1) == '+')
            {
                int i2 = s1.indexOf(';', i1);
                if (i2 > 0)
                {
                    ((StringBuilder) (obj)).append(s1.substring(i1, i2));
                } else
                {
                    ((StringBuilder) (obj)).append(s1.substring(i1));
                }
            }
            i1 = s1.indexOf("tel:");
            if (i1 >= 0)
            {
                i1 += 4;
            } else
            {
                i1 = 0;
            }
            ((StringBuilder) (obj)).append(s1.substring(i1, k1));
        } else
        {
            ((StringBuilder) (obj)).append(a(s1));
        }
        i1 = ((StringBuilder) (obj)).indexOf(";isub=");
        if (i1 > 0)
        {
            ((StringBuilder) (obj)).delete(i1, ((StringBuilder) (obj)).length());
        }
        if (!i(((StringBuilder) (obj)).toString()))
        {
            throw new gov(gow.b, "The string supplied did not seem to be a phone number.");
        }
        if (flag1)
        {
            String s3 = ((StringBuilder) (obj)).toString();
            boolean flag2;
            if (!j(s2) && (s3 == null || s3.length() == 0 || !b.matcher(s3).lookingAt()))
            {
                flag2 = false;
            } else
            {
                flag2 = true;
            }
            if (!flag2)
            {
                throw new gov(gow.a, "Missing or invalid default region.");
            }
        }
        if (flag)
        {
            gpw1.b(s1);
        }
        s1 = a(((StringBuilder) (obj)));
        if (s1.length() > 0)
        {
            gpw1.a(s1);
        }
        gpq gpq1 = d(s2);
        StringBuilder stringbuilder = new StringBuilder();
        int j1;
        try
        {
            j1 = a(((StringBuilder) (obj)).toString(), gpq1, stringbuilder, flag, gpw1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Matcher matcher = b.matcher(((StringBuilder) (obj)).toString());
            if (s1.a() == gow.a && matcher.lookingAt())
            {
                int l1 = a(((StringBuilder) (obj)).substring(matcher.end()), gpq1, stringbuilder, flag, gpw1);
                j1 = l1;
                if (l1 == 0)
                {
                    throw new gov(gow.a, "Could not interpret numbers after plus-sign.");
                }
            } else
            {
                throw new gov(s1.a(), s1.getMessage());
            }
        }
        if (j1 != 0)
        {
            obj = b(j1);
            s1 = gpq1;
            if (!((String) (obj)).equals(s2))
            {
                s1 = a(j1, ((String) (obj)));
            }
        } else
        {
            b(((StringBuilder) (obj)));
            stringbuilder.append(((CharSequence) (obj)));
            if (s2 != null)
            {
                gpw1.a(gpq1.n());
                s1 = gpq1;
            } else
            {
                s1 = gpq1;
                if (flag)
                {
                    gpw1.l();
                    s1 = gpq1;
                }
            }
        }
        if (stringbuilder.length() < 2)
        {
            throw new gov(gow.d, "The string supplied is too short to be a phone number.");
        }
        s2 = stringbuilder;
        if (s1 != null)
        {
            StringBuilder stringbuilder2 = new StringBuilder();
            StringBuilder stringbuilder1 = new StringBuilder(stringbuilder);
            a(stringbuilder1, ((gpq) (s1)), stringbuilder2);
            s2 = stringbuilder1.toString();
            boolean flag3 = flag4;
            if (a(F.a(s1.a().b()), s2) == gpn.c)
            {
                flag3 = true;
            }
            s2 = stringbuilder;
            if (!flag3)
            {
                if (flag)
                {
                    gpw1.c(stringbuilder2.toString());
                }
                s2 = stringbuilder1;
            }
        }
        flag3 = s2.length();
        if (flag3 < 2)
        {
            throw new gov(gow.d, "The string supplied is too short to be a phone number.");
        }
        if (flag3 > 17)
        {
            throw new gov(gow.e, "The string supplied is too long to be a phone number.");
        } else
        {
            a(s2.toString(), gpw1);
            gpw1.a(Long.parseLong(s2.toString()));
            return;
        }
    }

    public static gpb b()
    {
        gpb;
        JVM INSTR monitorenter ;
        Object obj;
        if (B != null)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        obj = a;
        if (obj != null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        throw new IllegalArgumentException("metadataLoader could not be null.");
        obj;
        gpb;
        JVM INSTR monitorexit ;
        throw obj;
        a(new gpb(new gou(((gor) (obj))), g.r()));
        obj = B;
        gpb;
        JVM INSTR monitorexit ;
        return ((gpb) (obj));
    }

    public static String b(String s1)
    {
        return a(s1, false).toString();
    }

    private static void b(StringBuilder stringbuilder)
    {
        String s1 = stringbuilder.toString();
        if (r.matcher(s1).matches())
        {
            Map map = k;
            StringBuilder stringbuilder1 = new StringBuilder(s1.length());
            for (int i1 = 0; i1 < s1.length(); i1++)
            {
                Character character = (Character)map.get(Character.valueOf(Character.toUpperCase(s1.charAt(i1))));
                if (character != null)
                {
                    stringbuilder1.append(character);
                }
            }

            s1 = stringbuilder1.toString();
        } else
        {
            s1 = b(s1);
        }
        stringbuilder.replace(0, stringbuilder.length(), s1);
    }

    private static boolean b(gpw gpw1, gpw gpw2)
    {
        gpw1 = String.valueOf(gpw1.b());
        gpw2 = String.valueOf(gpw2.b());
        return gpw1.endsWith(gpw2) || gpw2.endsWith(gpw1);
    }

    private boolean c(int i1)
    {
        return D.containsKey(Integer.valueOf(i1));
    }

    static boolean c(String s1)
    {
        return s1.length() == 0 || A.matcher(s1).matches();
    }

    private static String h(String s1)
    {
        String s2 = String.valueOf(String.valueOf(";ext=(\\p{Nd}{1,7})|[ \240\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\363))?n?|\uFF45?\uFF58\uFF54\uFF4E?|["));
        s1 = String.valueOf(String.valueOf(s1));
        String s3 = String.valueOf(String.valueOf("(\\p{Nd}{1,7})"));
        String s4 = String.valueOf(String.valueOf("\\p{Nd}"));
        return (new StringBuilder(s2.length() + 48 + s1.length() + s3.length() + s4.length())).append(s2).append(s1).append("]|int|anexo|\uFF49\uFF4E\uFF54)[:\\.\uFF0E]?[ \240\\t,-]*").append(s3).append("#?|[- ]+(").append(s4).append("{1,5})#").toString();
    }

    private static boolean i(String s1)
    {
        if (s1.length() < 2)
        {
            return false;
        } else
        {
            return v.matcher(s1).matches();
        }
    }

    private boolean j(String s1)
    {
        return s1 != null && G.contains(s1);
    }

    private int k(String s1)
    {
        gpq gpq1 = d(s1);
        if (gpq1 == null)
        {
            s1 = String.valueOf(s1);
            if (s1.length() != 0)
            {
                s1 = "Invalid region code: ".concat(s1);
            } else
            {
                s1 = new String("Invalid region code: ");
            }
            throw new IllegalArgumentException(s1);
        } else
        {
            return gpq1.n();
        }
    }

    int a(String s1, gpq gpq1, StringBuilder stringbuilder, boolean flag, gpw gpw1)
    {
        if (s1.length() == 0)
        {
            return 0;
        }
        StringBuilder stringbuilder1 = new StringBuilder(s1);
        s1 = "NonMatch";
        if (gpq1 != null)
        {
            s1 = gpq1.o();
        }
        s1 = a(stringbuilder1, s1);
        if (flag)
        {
            gpw1.a(s1);
        }
        if (s1 != gpx.d)
        {
            if (stringbuilder1.length() <= 2)
            {
                throw new gov(gow.c, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int i1 = a(stringbuilder1, stringbuilder);
            if (i1 != 0)
            {
                gpw1.a(i1);
                return i1;
            } else
            {
                throw new gov(gow.a, "Country calling code supplied was not recognised.");
            }
        }
        if (gpq1 != null)
        {
            int j1 = gpq1.n();
            s1 = String.valueOf(j1);
            Object obj = stringbuilder1.toString();
            if (((String) (obj)).startsWith(s1))
            {
                s1 = new StringBuilder(((String) (obj)).substring(s1.length()));
                gpu gpu1 = gpq1.a();
                obj = F.a(gpu1.a());
                a(((StringBuilder) (s1)), gpq1, ((StringBuilder) (null)));
                gpq1 = F.a(gpu1.b());
                if (!((Pattern) (obj)).matcher(stringbuilder1).matches() && ((Pattern) (obj)).matcher(s1).matches() || a(((Pattern) (gpq1)), stringbuilder1.toString()) == gpn.d)
                {
                    stringbuilder.append(s1);
                    if (flag)
                    {
                        gpw1.a(gpx.c);
                    }
                    gpw1.a(j1);
                    return j1;
                }
            }
        }
        gpw1.a(0);
        return 0;
    }

    int a(StringBuilder stringbuilder, StringBuilder stringbuilder1)
    {
        if (stringbuilder.length() == 0 || stringbuilder.charAt(0) == '0')
        {
            return 0;
        }
        int j1 = stringbuilder.length();
        for (int i1 = 1; i1 <= 3 && i1 <= j1; i1++)
        {
            int k1 = Integer.parseInt(stringbuilder.substring(0, i1));
            if (D.containsKey(Integer.valueOf(k1)))
            {
                stringbuilder1.append(stringbuilder.substring(i1));
                return k1;
            }
        }

        return 0;
    }

    public gpk a(gpw gpw1, gpw gpw2)
    {
        gpw gpw3 = new gpw();
        gpw3.a(gpw1);
        gpw1 = new gpw();
        gpw1.a(gpw2);
        gpw3.j();
        gpw3.l();
        gpw3.m();
        gpw1.j();
        gpw1.l();
        gpw1.m();
        if (gpw3.c() && gpw3.d().length() == 0)
        {
            gpw3.e();
        }
        if (gpw1.c() && gpw1.d().length() == 0)
        {
            gpw1.e();
        }
        if (gpw3.c() && gpw1.c() && !gpw3.d().equals(gpw1.d()))
        {
            return gpk.b;
        }
        int i1 = gpw3.a();
        int j1 = gpw1.a();
        if (i1 != 0 && j1 != 0)
        {
            if (gpw3.b(gpw1))
            {
                return gpk.e;
            }
            if (i1 == j1 && b(gpw3, gpw1))
            {
                return gpk.c;
            } else
            {
                return gpk.b;
            }
        }
        gpw3.a(j1);
        if (gpw3.b(gpw1))
        {
            return gpk.d;
        }
        if (b(gpw3, gpw1))
        {
            return gpk.c;
        } else
        {
            return gpk.b;
        }
    }

    gpo a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            gpo gpo1 = (gpo)list.next();
            int i1 = gpo1.c();
            if ((i1 == 0 || F.a(gpo1.a(i1 - 1)).matcher(s1).lookingAt()) && F.a(gpo1.a()).matcher(s1).matches())
            {
                return gpo1;
            }
        }

        return null;
    }

    gpq a(int i1)
    {
        if (!D.containsKey(Integer.valueOf(i1)))
        {
            return null;
        } else
        {
            return C.a(i1);
        }
    }

    public gpw a(String s1, String s2)
    {
        gpw gpw1 = new gpw();
        a(s1, s2, gpw1);
        return gpw1;
    }

    gpx a(StringBuilder stringbuilder, String s1)
    {
        boolean flag;
        flag = true;
        if (stringbuilder.length() == 0)
        {
            return gpx.d;
        }
        Matcher matcher = b.matcher(stringbuilder);
        if (matcher.lookingAt())
        {
            stringbuilder.delete(0, matcher.end());
            b(stringbuilder);
            return gpx.a;
        }
        s1 = F.a(s1);
        b(stringbuilder);
        s1 = s1.matcher(stringbuilder);
        if (!s1.lookingAt())
        {
            break MISSING_BLOCK_LABEL_133;
        }
        int i1 = s1.end();
        s1 = p.matcher(stringbuilder.substring(i1));
        if (s1.find() && b(s1.group(1)).equals("0"))
        {
            break MISSING_BLOCK_LABEL_133;
        }
        stringbuilder.delete(0, i1);
_L1:
        if (flag)
        {
            return gpx.b;
        } else
        {
            return gpx.d;
        }
        flag = false;
          goto _L1
    }

    public String a(gpw gpw1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (gpw1.f())
        {
            char ac[] = new char[gpw1.g()];
            Arrays.fill(ac, '0');
            stringbuilder.append(new String(ac));
        }
        stringbuilder.append(gpw1.b());
        return stringbuilder.toString();
    }

    public String a(gpw gpw1, int i1)
    {
        if (gpw1.b() == 0L && gpw1.h())
        {
            String s1 = gpw1.i();
            if (s1.length() > 0)
            {
                return s1;
            }
        }
        StringBuilder stringbuilder = new StringBuilder(20);
        a(gpw1, i1, stringbuilder);
        return stringbuilder.toString();
    }

    String a(String s1, gpo gpo1, int i1)
    {
        return a(s1, gpo1, i1, null);
    }

    String a(StringBuilder stringbuilder)
    {
        Matcher matcher = u.matcher(stringbuilder);
        if (matcher.find() && i(stringbuilder.substring(0, matcher.start())))
        {
            int i1 = 1;
            for (int j1 = matcher.groupCount(); i1 <= j1; i1++)
            {
                if (matcher.group(i1) != null)
                {
                    String s1 = matcher.group(i1);
                    stringbuilder.delete(matcher.start(), stringbuilder.length());
                    return s1;
                }
            }

        }
        return "";
    }

    public Set a()
    {
        return Collections.unmodifiableSet(G);
    }

    public void a(gpw gpw1, int i1, StringBuilder stringbuilder)
    {
        stringbuilder.setLength(0);
        int j1 = gpw1.a();
        String s1 = a(gpw1);
        if (i1 == gpl.a)
        {
            stringbuilder.append(s1);
            a(j1, gpl.a, stringbuilder);
            return;
        }
        if (!c(j1))
        {
            stringbuilder.append(s1);
            return;
        }
        gpq gpq1 = a(j1, b(j1));
        Object obj;
        if (gpq1.z().size() == 0 || i1 == gpl.c)
        {
            obj = gpq1.x();
        } else
        {
            obj = gpq1.z();
        }
        obj = a(((List) (obj)), s1);
        if (obj == null)
        {
            obj = s1;
        } else
        {
            obj = a(s1, ((gpo) (obj)), i1, null);
        }
        stringbuilder.append(((String) (obj)));
        if (gpw1.c() && gpw1.d().length() > 0)
        {
            if (i1 == gpl.d)
            {
                stringbuilder.append(";ext=").append(gpw1.d());
            } else
            if (gpq1.r())
            {
                stringbuilder.append(gpq1.s()).append(gpw1.d());
            } else
            {
                stringbuilder.append(" ext. ").append(gpw1.d());
            }
        }
        a(j1, i1, stringbuilder);
    }

    public void a(String s1, String s2, gpw gpw1)
    {
        a(s1, s2, false, true, gpw1);
    }

    public boolean a(gpw gpw1, String s1)
    {
        int i1 = gpw1.a();
        for (gpq gpq1 = a(i1, s1); gpq1 == null || !"001".equals(s1) && i1 != k(s1) || a(a(gpw1), gpq1) == gpm.l;)
        {
            return false;
        }

        return true;
    }

    boolean a(String s1, gpu gpu1)
    {
        return F.a(gpu1.b()).matcher(s1).matches();
    }

    boolean a(StringBuilder stringbuilder, gpq gpq1, StringBuilder stringbuilder1)
    {
        Object obj;
        int i1;
        i1 = stringbuilder.length();
        obj = gpq1.u();
        if (i1 != 0 && ((String) (obj)).length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Pattern pattern;
        int j1;
        boolean flag;
        if (!((Matcher) (obj = F.a(((String) (obj))).matcher(stringbuilder))).lookingAt())
        {
            continue; /* Loop/switch isn't completed */
        }
        pattern = F.a(gpq1.a().a());
        flag = pattern.matcher(stringbuilder).matches();
        j1 = ((Matcher) (obj)).groupCount();
        gpq1 = gpq1.v();
        if (gpq1 != null && gpq1.length() != 0 && ((Matcher) (obj)).group(j1) != null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!flag || pattern.matcher(stringbuilder.substring(((Matcher) (obj)).end())).matches())
        {
            if (stringbuilder1 != null && j1 > 0 && ((Matcher) (obj)).group(j1) != null)
            {
                stringbuilder1.append(((Matcher) (obj)).group(1));
            }
            stringbuilder.delete(0, ((Matcher) (obj)).end());
            return true;
        }
        if (true) goto _L1; else goto _L3
_L3:
        StringBuilder stringbuilder2 = new StringBuilder(stringbuilder);
        stringbuilder2.replace(0, i1, ((Matcher) (obj)).replaceFirst(gpq1));
        if (!flag || pattern.matcher(stringbuilder2.toString()).matches())
        {
            if (stringbuilder1 != null && j1 > 1)
            {
                stringbuilder1.append(((Matcher) (obj)).group(1));
            }
            stringbuilder.replace(0, stringbuilder.length(), stringbuilder2.toString());
            return true;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public gpk b(gpw gpw1, String s1)
    {
        Object obj = a(gpw1, a(s1, "ZZ"));
        gpw1 = ((gpw) (obj));
_L2:
        return gpw1;
        gov gov1;
        gov1;
        if (gov1.a() != gow.a)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        gov1 = b(gpw1.a());
        if (gov1.equals("ZZ"))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s1 = a(gpw1, a(s1, gov1));
        gpw1 = s1;
        if (s1 != gpk.e) goto _L2; else goto _L1
_L1:
        return gpk.d;
        gpw gpw2 = new gpw();
        a(s1, ((String) (null)), false, false, gpw2);
        gpw1 = a(gpw1, gpw2);
        return gpw1;
        gpw1;
        return gpk.a;
    }

    public gpw b(String s1, String s2)
    {
        gpw gpw1 = new gpw();
        b(s1, s2, gpw1);
        return gpw1;
    }

    public String b(int i1)
    {
        List list = (List)D.get(Integer.valueOf(i1));
        if (list == null)
        {
            return "ZZ";
        } else
        {
            return (String)list.get(0);
        }
    }

    public void b(String s1, String s2, gpw gpw1)
    {
        a(s1, s2, true, true, gpw1);
    }

    public boolean b(gpw gpw1)
    {
        return a(gpw1, c(gpw1));
    }

    boolean b(String s1, gpu gpu1)
    {
        Matcher matcher = F.a(gpu1.a()).matcher(s1);
        return a(s1, gpu1) && matcher.matches();
    }

    public gpk c(String s1, String s2)
    {
        gpk gpk1 = b(a(s1, "ZZ"), s2);
        return gpk1;
        gov gov1;
        gov1;
        if (gov1.a() != gow.a)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        gov1 = b(a(s2, "ZZ"), s1);
        return gov1;
        gov1;
        if (gov1.a() != gow.a)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        gpw gpw1 = new gpw();
        gpw gpw2 = new gpw();
        a(s1, ((String) (null)), false, false, gpw1);
        a(s2, ((String) (null)), false, false, gpw2);
        s1 = a(gpw1, gpw2);
        return s1;
        s1;
        return gpk.a;
    }

    public String c(gpw gpw1)
    {
        int i1 = gpw1.a();
        Object obj = (List)D.get(Integer.valueOf(i1));
        if (obj == null)
        {
            String s1 = a(gpw1);
            gpw1 = g;
            obj = Level.INFO;
            s1 = String.valueOf(String.valueOf(s1));
            gpw1.log(((Level) (obj)), (new StringBuilder(s1.length() + 54)).append("Missing/invalid country_code (").append(i1).append(") for number ").append(s1).toString());
            return null;
        }
        if (((List) (obj)).size() == 1)
        {
            return (String)((List) (obj)).get(0);
        } else
        {
            return a(gpw1, ((List) (obj)));
        }
    }

    gpq d(String s1)
    {
        if (!j(s1))
        {
            return null;
        } else
        {
            return C.a(s1);
        }
    }

    public boolean d(gpw gpw1)
    {
        return e(gpw1) == gpn.a;
    }

    public int e(gpw gpw1)
    {
        String s1 = a(gpw1);
        int i1 = gpw1.a();
        if (!c(i1))
        {
            return gpn.b;
        } else
        {
            gpw1 = a(i1, b(i1));
            return a(F.a(gpw1.a().b()), s1);
        }
    }

    public int e(String s1)
    {
        if (!j(s1))
        {
            Logger logger = g;
            Level level = Level.WARNING;
            String s2 = s1;
            if (s1 == null)
            {
                s2 = "null";
            }
            s1 = String.valueOf(String.valueOf(s2));
            logger.log(level, (new StringBuilder(s1.length() + 43)).append("Invalid or missing region code (").append(s1).append(") provided.").toString());
            return 0;
        } else
        {
            return k(s1);
        }
    }

    public String f(String s1)
    {
        Object obj = d(s1);
        if (obj == null)
        {
            Logger logger = g;
            Level level = Level.WARNING;
            obj = s1;
            if (s1 == null)
            {
                obj = "null";
            }
            s1 = String.valueOf(String.valueOf(obj));
            logger.log(level, (new StringBuilder(s1.length() + 43)).append("Invalid or missing region code (").append(s1).append(") provided.").toString());
        } else
        {
            s1 = ((gpq) (obj)).q();
            if (s1.length() != 0)
            {
                return s1.replace("~", "");
            }
        }
        return null;
    }

    public goq g(String s1)
    {
        return new goq(s1);
    }

    static 
    {
        Object obj = new HashMap();
        ((HashMap) (obj)).put(Integer.valueOf(52), "1");
        ((HashMap) (obj)).put(Integer.valueOf(54), "9");
        h = Collections.unmodifiableMap(((Map) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put(Character.valueOf('0'), Character.valueOf('0'));
        ((HashMap) (obj)).put(Character.valueOf('1'), Character.valueOf('1'));
        ((HashMap) (obj)).put(Character.valueOf('2'), Character.valueOf('2'));
        ((HashMap) (obj)).put(Character.valueOf('3'), Character.valueOf('3'));
        ((HashMap) (obj)).put(Character.valueOf('4'), Character.valueOf('4'));
        ((HashMap) (obj)).put(Character.valueOf('5'), Character.valueOf('5'));
        ((HashMap) (obj)).put(Character.valueOf('6'), Character.valueOf('6'));
        ((HashMap) (obj)).put(Character.valueOf('7'), Character.valueOf('7'));
        ((HashMap) (obj)).put(Character.valueOf('8'), Character.valueOf('8'));
        ((HashMap) (obj)).put(Character.valueOf('9'), Character.valueOf('9'));
        Object obj1 = new HashMap(40);
        ((HashMap) (obj1)).put(Character.valueOf('A'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('B'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('C'), Character.valueOf('2'));
        ((HashMap) (obj1)).put(Character.valueOf('D'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('E'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('F'), Character.valueOf('3'));
        ((HashMap) (obj1)).put(Character.valueOf('G'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('H'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('I'), Character.valueOf('4'));
        ((HashMap) (obj1)).put(Character.valueOf('J'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('K'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('L'), Character.valueOf('5'));
        ((HashMap) (obj1)).put(Character.valueOf('M'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('N'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('O'), Character.valueOf('6'));
        ((HashMap) (obj1)).put(Character.valueOf('P'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('Q'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('R'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('S'), Character.valueOf('7'));
        ((HashMap) (obj1)).put(Character.valueOf('T'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('U'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('V'), Character.valueOf('8'));
        ((HashMap) (obj1)).put(Character.valueOf('W'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('X'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('Y'), Character.valueOf('9'));
        ((HashMap) (obj1)).put(Character.valueOf('Z'), Character.valueOf('9'));
        j = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap(100);
        ((HashMap) (obj1)).putAll(j);
        ((HashMap) (obj1)).putAll(((Map) (obj)));
        k = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap();
        ((HashMap) (obj1)).putAll(((Map) (obj)));
        ((HashMap) (obj1)).put(Character.valueOf('+'), Character.valueOf('+'));
        ((HashMap) (obj1)).put(Character.valueOf('*'), Character.valueOf('*'));
        i = Collections.unmodifiableMap(((Map) (obj1)));
        obj1 = new HashMap();
        char c1;
        for (Iterator iterator = j.keySet().iterator(); iterator.hasNext(); ((HashMap) (obj1)).put(Character.valueOf(c1), Character.valueOf(c1)))
        {
            c1 = ((Character)iterator.next()).charValue();
            ((HashMap) (obj1)).put(Character.valueOf(Character.toLowerCase(c1)), Character.valueOf(c1));
        }

        ((HashMap) (obj1)).putAll(((Map) (obj)));
        ((HashMap) (obj1)).put(Character.valueOf('-'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0D'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2010'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2011'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2012'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2013'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2014'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2015'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('\u2212'), Character.valueOf('-'));
        ((HashMap) (obj1)).put(Character.valueOf('/'), Character.valueOf('/'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0F'), Character.valueOf('/'));
        ((HashMap) (obj1)).put(Character.valueOf(' '), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('\u3000'), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('\u2060'), Character.valueOf(' '));
        ((HashMap) (obj1)).put(Character.valueOf('.'), Character.valueOf('.'));
        ((HashMap) (obj1)).put(Character.valueOf('\uFF0E'), Character.valueOf('.'));
        l = Collections.unmodifiableMap(((Map) (obj1)));
        obj = String.valueOf(Arrays.toString(j.keySet().toArray()).replaceAll("[, \\[\\]]", ""));
        obj1 = String.valueOf(Arrays.toString(j.keySet().toArray()).toLowerCase().replaceAll("[, \\[\\]]", ""));
        String s1;
        if (((String) (obj1)).length() != 0)
        {
            obj = ((String) (obj)).concat(((String) (obj1)));
        } else
        {
            obj = new String(((String) (obj)));
        }
        n = ((String) (obj));
        obj = String.valueOf(String.valueOf("\\p{Nd}{2}|[+\uFF0B]*+(?:[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*"));
        obj1 = String.valueOf(String.valueOf(n));
        s1 = String.valueOf(String.valueOf("\\p{Nd}"));
        s = (new StringBuilder(((String) (obj)).length() + 2 + ((String) (obj1)).length() + s1.length())).append(((String) (obj))).append(((String) (obj1))).append(s1).append("]*").toString();
        obj = String.valueOf("x\uFF58#\uFF03~\uFF5E");
        if (((String) (obj)).length() != 0)
        {
            obj = ",".concat(((String) (obj)));
        } else
        {
            obj = new String(",");
        }
        t = h(((String) (obj)));
        obj = String.valueOf(String.valueOf(t));
        u = Pattern.compile((new StringBuilder(((String) (obj)).length() + 5)).append("(?:").append(((String) (obj))).append(")$").toString(), 66);
        obj = String.valueOf(String.valueOf(s));
        obj1 = String.valueOf(String.valueOf(t));
        v = Pattern.compile((new StringBuilder(((String) (obj)).length() + 5 + ((String) (obj1)).length())).append(((String) (obj))).append("(?:").append(((String) (obj1))).append(")?").toString(), 66);
    }
}
