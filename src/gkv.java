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

public class gkv
{

    private static final Pattern A = Pattern.compile("\\(?\\$1\\)?");
    private static gkv B = null;
    static final gkl a = new gkl();
    static final Pattern b = Pattern.compile("[+\uFF0B]+");
    static final Pattern c = Pattern.compile("[\\\\/] *x");
    static final Pattern d = Pattern.compile("[[\\P{N}&&\\P{L}]&&[^#]]+$");
    static final String e = h("x\uFF58#\uFF03~\uFF5E");
    static final Pattern f = Pattern.compile("(\\D+)");
    private static final Logger g = Logger.getLogger(gkv.getName());
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
    private final gkn C;
    private final Map D;
    private final Set E = new HashSet(35);
    private final gls F = new gls(100);
    private final Set G = new HashSet(320);
    private final Set H = new HashSet();

    private gkv(gkn gkn1, Map map)
    {
        C = gkn1;
        D = map;
        for (gkn1 = map.entrySet().iterator(); gkn1.hasNext();)
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)gkn1.next();
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

    private int a(String s1, glk glk1)
    {
        if (!b(s1, glk1.a()))
        {
            return glg.l;
        }
        if (b(s1, glk1.e()))
        {
            return glg.e;
        }
        if (b(s1, glk1.d()))
        {
            return glg.d;
        }
        if (b(s1, glk1.f()))
        {
            return glg.f;
        }
        if (b(s1, glk1.h()))
        {
            return glg.g;
        }
        if (b(s1, glk1.g()))
        {
            return glg.h;
        }
        if (b(s1, glk1.i()))
        {
            return glg.i;
        }
        if (b(s1, glk1.j()))
        {
            return glg.j;
        }
        if (b(s1, glk1.m()))
        {
            return glg.k;
        }
        if (b(s1, glk1.b()))
        {
            if (glk1.w())
            {
                return glg.c;
            }
            if (b(s1, glk1.c()))
            {
                return glg.c;
            } else
            {
                return glg.a;
            }
        }
        if (!glk1.w() && b(s1, glk1.c()))
        {
            return glg.b;
        } else
        {
            return glg.l;
        }
    }

    private static int a(Pattern pattern, String s1)
    {
        pattern = pattern.matcher(s1);
        if (pattern.matches())
        {
            return glh.a;
        }
        if (pattern.lookingAt())
        {
            return glh.d;
        } else
        {
            return glh.c;
        }
    }

    private glk a(int i1, String s1)
    {
        if ("001".equals(s1))
        {
            return a(i1);
        } else
        {
            return d(s1);
        }
    }

    private String a(glq glq1, List list)
    {
label0:
        {
            glq1 = a(glq1);
            list = list.iterator();
            String s1;
            glk glk1;
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
                    glk1 = d(s1);
                    if (!glk1.B())
                    {
                        continue label1;
                    }
                } while (!F.a(glk1.C()).matcher(glq1).lookingAt());
                return s1;
            } while (a(((String) (glq1)), glk1) == glg.l);
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

    private String a(String s1, gli gli1, int i1, String s2)
    {
        s2 = gli1.b();
        s1 = F.a(gli1.a()).matcher(s1);
        int j1 = glf.c;
        gli1 = gli1.d();
        if (i1 == glf.c && gli1 != null && gli1.length() > 0)
        {
            s1 = s1.replaceAll(w.matcher(s2).replaceFirst(gli1));
        } else
        {
            s1 = s1.replaceAll(s2);
        }
        gli1 = s1;
        if (i1 == glf.d)
        {
            gli1 = o.matcher(s1);
            if (gli1.lookingAt())
            {
                s1 = gli1.replaceFirst("");
            }
            gli1 = gli1.reset(s1).replaceAll("-");
        }
        return gli1;
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
        switch (gkw.b[j1 - 1])
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

    private static void a(gkv gkv1)
    {
        gkv;
        JVM INSTR monitorenter ;
        B = gkv1;
        gkv;
        JVM INSTR monitorexit ;
        return;
        gkv1;
        throw gkv1;
    }

    private static void a(String s1, glq glq1)
    {
        if (s1.length() > 1 && s1.charAt(0) == '0')
        {
            glq1.a(true);
            int i1;
            for (i1 = 1; i1 < s1.length() - 1 && s1.charAt(i1) == '0'; i1++) { }
            if (i1 != 1)
            {
                glq1.b(i1);
            }
        }
    }

    private void a(String s1, String s2, boolean flag, boolean flag1, glq glq1)
    {
        boolean flag4 = false;
        if (s1 == null)
        {
            throw new gkp(gkq.b, "The phone number supplied was null.");
        }
        if (s1.length() > 250)
        {
            throw new gkp(gkq.e, "The string supplied was too long to parse.");
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
            throw new gkp(gkq.b, "The string supplied did not seem to be a phone number.");
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
                throw new gkp(gkq.a, "Missing or invalid default region.");
            }
        }
        if (flag)
        {
            glq1.b(s1);
        }
        s1 = a(((StringBuilder) (obj)));
        if (s1.length() > 0)
        {
            glq1.a(s1);
        }
        glk glk1 = d(s2);
        StringBuilder stringbuilder = new StringBuilder();
        int j1;
        try
        {
            j1 = a(((StringBuilder) (obj)).toString(), glk1, stringbuilder, flag, glq1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            Matcher matcher = b.matcher(((StringBuilder) (obj)).toString());
            if (s1.a() == gkq.a && matcher.lookingAt())
            {
                int l1 = a(((StringBuilder) (obj)).substring(matcher.end()), glk1, stringbuilder, flag, glq1);
                j1 = l1;
                if (l1 == 0)
                {
                    throw new gkp(gkq.a, "Could not interpret numbers after plus-sign.");
                }
            } else
            {
                throw new gkp(s1.a(), s1.getMessage());
            }
        }
        if (j1 != 0)
        {
            obj = b(j1);
            s1 = glk1;
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
                glq1.a(glk1.n());
                s1 = glk1;
            } else
            {
                s1 = glk1;
                if (flag)
                {
                    glq1.l();
                    s1 = glk1;
                }
            }
        }
        if (stringbuilder.length() < 2)
        {
            throw new gkp(gkq.d, "The string supplied is too short to be a phone number.");
        }
        s2 = stringbuilder;
        if (s1 != null)
        {
            StringBuilder stringbuilder2 = new StringBuilder();
            StringBuilder stringbuilder1 = new StringBuilder(stringbuilder);
            a(stringbuilder1, ((glk) (s1)), stringbuilder2);
            s2 = stringbuilder1.toString();
            boolean flag3 = flag4;
            if (a(F.a(s1.a().b()), s2) == glh.c)
            {
                flag3 = true;
            }
            s2 = stringbuilder;
            if (!flag3)
            {
                if (flag)
                {
                    glq1.c(stringbuilder2.toString());
                }
                s2 = stringbuilder1;
            }
        }
        flag3 = s2.length();
        if (flag3 < 2)
        {
            throw new gkp(gkq.d, "The string supplied is too short to be a phone number.");
        }
        if (flag3 > 17)
        {
            throw new gkp(gkq.e, "The string supplied is too long to be a phone number.");
        } else
        {
            a(s2.toString(), glq1);
            glq1.a(Long.parseLong(s2.toString()));
            return;
        }
    }

    public static gkv b()
    {
        gkv;
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
        gkv;
        JVM INSTR monitorexit ;
        throw obj;
        a(new gkv(new gko(((gkl) (obj))), g.s()));
        obj = B;
        gkv;
        JVM INSTR monitorexit ;
        return ((gkv) (obj));
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

    private static boolean b(glq glq1, glq glq2)
    {
        glq1 = String.valueOf(glq1.b());
        glq2 = String.valueOf(glq2.b());
        return glq1.endsWith(glq2) || glq2.endsWith(glq1);
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
        String s2 = String.valueOf(";ext=(\\p{Nd}{1,7})|[ \240\\t,]*(?:e?xt(?:ensi(?:o\u0301?|\363))?n?|\uFF45?\uFF58\uFF54\uFF4E?|[");
        String s3 = String.valueOf("(\\p{Nd}{1,7})");
        String s4 = String.valueOf("\\p{Nd}");
        return (new StringBuilder(String.valueOf(s2).length() + 48 + String.valueOf(s1).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append(s2).append(s1).append("]|int|anexo|\uFF49\uFF4E\uFF54)[:\\.\uFF0E]?[ \240\\t,-]*").append(s3).append("#?|[- ]+(").append(s4).append("{1,5})#").toString();
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
        glk glk1 = d(s1);
        if (glk1 == null)
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
            return glk1.n();
        }
    }

    int a(String s1, glk glk1, StringBuilder stringbuilder, boolean flag, glq glq1)
    {
        if (s1.length() == 0)
        {
            return 0;
        }
        StringBuilder stringbuilder1 = new StringBuilder(s1);
        s1 = "NonMatch";
        if (glk1 != null)
        {
            s1 = glk1.o();
        }
        s1 = a(stringbuilder1, s1);
        if (flag)
        {
            glq1.a(s1);
        }
        if (s1 != glr.d)
        {
            if (stringbuilder1.length() <= 2)
            {
                throw new gkp(gkq.c, "Phone number had an IDD, but after this was not long enough to be a viable phone number.");
            }
            int i1 = a(stringbuilder1, stringbuilder);
            if (i1 != 0)
            {
                glq1.a(i1);
                return i1;
            } else
            {
                throw new gkp(gkq.a, "Country calling code supplied was not recognised.");
            }
        }
        if (glk1 != null)
        {
            int j1 = glk1.n();
            s1 = String.valueOf(j1);
            Object obj = stringbuilder1.toString();
            if (((String) (obj)).startsWith(s1))
            {
                s1 = new StringBuilder(((String) (obj)).substring(s1.length()));
                glo glo1 = glk1.a();
                obj = F.a(glo1.a());
                a(((StringBuilder) (s1)), glk1, ((StringBuilder) (null)));
                glk1 = F.a(glo1.b());
                if (!((Pattern) (obj)).matcher(stringbuilder1).matches() && ((Pattern) (obj)).matcher(s1).matches() || a(((Pattern) (glk1)), stringbuilder1.toString()) == glh.d)
                {
                    stringbuilder.append(s1);
                    if (flag)
                    {
                        glq1.a(glr.c);
                    }
                    glq1.a(j1);
                    return j1;
                }
            }
        }
        glq1.a(0);
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

    public gle a(glq glq1, glq glq2)
    {
        glq glq3 = new glq();
        glq3.a(glq1);
        glq1 = new glq();
        glq1.a(glq2);
        glq3.j();
        glq3.l();
        glq3.m();
        glq1.j();
        glq1.l();
        glq1.m();
        if (glq3.c() && glq3.d().length() == 0)
        {
            glq3.e();
        }
        if (glq1.c() && glq1.d().length() == 0)
        {
            glq1.e();
        }
        if (glq3.c() && glq1.c() && !glq3.d().equals(glq1.d()))
        {
            return gle.b;
        }
        int i1 = glq3.a();
        int j1 = glq1.a();
        if (i1 != 0 && j1 != 0)
        {
            if (glq3.b(glq1))
            {
                return gle.e;
            }
            if (i1 == j1 && b(glq3, glq1))
            {
                return gle.c;
            } else
            {
                return gle.b;
            }
        }
        glq3.a(j1);
        if (glq3.b(glq1))
        {
            return gle.d;
        }
        if (b(glq3, glq1))
        {
            return gle.c;
        } else
        {
            return gle.b;
        }
    }

    gli a(List list, String s1)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            gli gli1 = (gli)list.next();
            int i1 = gli1.c();
            if ((i1 == 0 || F.a(gli1.a(i1 - 1)).matcher(s1).lookingAt()) && F.a(gli1.a()).matcher(s1).matches())
            {
                return gli1;
            }
        }

        return null;
    }

    glk a(int i1)
    {
        if (!D.containsKey(Integer.valueOf(i1)))
        {
            return null;
        } else
        {
            return C.a(i1);
        }
    }

    public glq a(String s1, String s2)
    {
        glq glq1 = new glq();
        a(s1, s2, glq1);
        return glq1;
    }

    glr a(StringBuilder stringbuilder, String s1)
    {
        boolean flag;
        flag = true;
        if (stringbuilder.length() == 0)
        {
            return glr.d;
        }
        Matcher matcher = b.matcher(stringbuilder);
        if (matcher.lookingAt())
        {
            stringbuilder.delete(0, matcher.end());
            b(stringbuilder);
            return glr.a;
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
            return glr.b;
        } else
        {
            return glr.d;
        }
        flag = false;
          goto _L1
    }

    public String a(glq glq1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (glq1.f())
        {
            char ac[] = new char[glq1.g()];
            Arrays.fill(ac, '0');
            stringbuilder.append(new String(ac));
        }
        stringbuilder.append(glq1.b());
        return stringbuilder.toString();
    }

    public String a(glq glq1, int i1)
    {
        if (glq1.b() == 0L && glq1.h())
        {
            String s1 = glq1.i();
            if (s1.length() > 0)
            {
                return s1;
            }
        }
        StringBuilder stringbuilder = new StringBuilder(20);
        a(glq1, i1, stringbuilder);
        return stringbuilder.toString();
    }

    String a(String s1, gli gli1, int i1)
    {
        return a(s1, gli1, i1, null);
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

    public void a(glq glq1, int i1, StringBuilder stringbuilder)
    {
        stringbuilder.setLength(0);
        int j1 = glq1.a();
        String s1 = a(glq1);
        if (i1 == glf.a)
        {
            stringbuilder.append(s1);
            a(j1, glf.a, stringbuilder);
            return;
        }
        if (!c(j1))
        {
            stringbuilder.append(s1);
            return;
        }
        glk glk1 = a(j1, b(j1));
        Object obj;
        if (glk1.z().size() == 0 || i1 == glf.c)
        {
            obj = glk1.x();
        } else
        {
            obj = glk1.z();
        }
        obj = a(((List) (obj)), s1);
        if (obj == null)
        {
            obj = s1;
        } else
        {
            obj = a(s1, ((gli) (obj)), i1, null);
        }
        stringbuilder.append(((String) (obj)));
        if (glq1.c() && glq1.d().length() > 0)
        {
            if (i1 == glf.d)
            {
                stringbuilder.append(";ext=").append(glq1.d());
            } else
            if (glk1.r())
            {
                stringbuilder.append(glk1.s()).append(glq1.d());
            } else
            {
                stringbuilder.append(" ext. ").append(glq1.d());
            }
        }
        a(j1, i1, stringbuilder);
    }

    public void a(String s1, String s2, glq glq1)
    {
        a(s1, s2, false, true, glq1);
    }

    public boolean a(glq glq1, String s1)
    {
        int i1 = glq1.a();
        for (glk glk1 = a(i1, s1); glk1 == null || !"001".equals(s1) && i1 != k(s1) || a(a(glq1), glk1) == glg.l;)
        {
            return false;
        }

        return true;
    }

    boolean a(String s1, glo glo1)
    {
        return F.a(glo1.b()).matcher(s1).matches();
    }

    boolean a(StringBuilder stringbuilder, glk glk1, StringBuilder stringbuilder1)
    {
        Object obj;
        int i1;
        i1 = stringbuilder.length();
        obj = glk1.u();
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
        pattern = F.a(glk1.a().a());
        flag = pattern.matcher(stringbuilder).matches();
        j1 = ((Matcher) (obj)).groupCount();
        glk1 = glk1.v();
        if (glk1 != null && glk1.length() != 0 && ((Matcher) (obj)).group(j1) != null)
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
        stringbuilder2.replace(0, i1, ((Matcher) (obj)).replaceFirst(glk1));
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

    public gle b(glq glq1, String s1)
    {
        Object obj = a(glq1, a(s1, "ZZ"));
        glq1 = ((glq) (obj));
_L2:
        return glq1;
        gkp gkp1;
        gkp1;
        if (gkp1.a() != gkq.a)
        {
            break MISSING_BLOCK_LABEL_100;
        }
        gkp1 = b(glq1.a());
        if (gkp1.equals("ZZ"))
        {
            break MISSING_BLOCK_LABEL_73;
        }
        s1 = a(glq1, a(s1, gkp1));
        glq1 = s1;
        if (s1 != gle.e) goto _L2; else goto _L1
_L1:
        return gle.d;
        glq glq2 = new glq();
        a(s1, ((String) (null)), false, false, glq2);
        glq1 = a(glq1, glq2);
        return glq1;
        glq1;
        return gle.a;
    }

    public glq b(String s1, String s2)
    {
        glq glq1 = new glq();
        b(s1, s2, glq1);
        return glq1;
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

    public void b(String s1, String s2, glq glq1)
    {
        a(s1, s2, true, true, glq1);
    }

    public boolean b(glq glq1)
    {
        return a(glq1, c(glq1));
    }

    boolean b(String s1, glo glo1)
    {
        Matcher matcher = F.a(glo1.a()).matcher(s1);
        return a(s1, glo1) && matcher.matches();
    }

    public gle c(String s1, String s2)
    {
        gle gle1 = b(a(s1, "ZZ"), s2);
        return gle1;
        gkp gkp1;
        gkp1;
        if (gkp1.a() != gkq.a)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        gkp1 = b(a(s2, "ZZ"), s1);
        return gkp1;
        gkp1;
        if (gkp1.a() != gkq.a)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        glq glq1 = new glq();
        glq glq2 = new glq();
        a(s1, ((String) (null)), false, false, glq1);
        a(s2, ((String) (null)), false, false, glq2);
        s1 = a(glq1, glq2);
        return s1;
        s1;
        return gle.a;
    }

    public String c(glq glq1)
    {
        int i1 = glq1.a();
        List list = (List)D.get(Integer.valueOf(i1));
        if (list == null)
        {
            glq1 = a(glq1);
            g.log(Level.INFO, (new StringBuilder(String.valueOf(glq1).length() + 54)).append("Missing/invalid country_code (").append(i1).append(") for number ").append(glq1).toString());
            return null;
        }
        if (list.size() == 1)
        {
            return (String)list.get(0);
        } else
        {
            return a(glq1, list);
        }
    }

    glk d(String s1)
    {
        if (!j(s1))
        {
            return null;
        } else
        {
            return C.a(s1);
        }
    }

    public boolean d(glq glq1)
    {
        return e(glq1) == glh.a;
    }

    public int e(glq glq1)
    {
        String s1 = a(glq1);
        int i1 = glq1.a();
        if (!c(i1))
        {
            return glh.b;
        } else
        {
            glq1 = a(i1, b(i1));
            return a(F.a(glq1.a().b()), s1);
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
            logger.log(level, (new StringBuilder(String.valueOf(s2).length() + 43)).append("Invalid or missing region code (").append(s2).append(") provided.").toString());
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
            logger.log(level, (new StringBuilder(String.valueOf(obj).length() + 43)).append("Invalid or missing region code (").append(((String) (obj))).append(") provided.").toString());
        } else
        {
            s1 = ((glk) (obj)).q();
            if (s1.length() != 0)
            {
                return s1.replace("~", "");
            }
        }
        return null;
    }

    public gkk g(String s1)
    {
        return new gkk(s1);
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
        obj = String.valueOf("\\p{Nd}{2}|[+\uFF0B]*+(?:[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*]*\\p{Nd}){3,}[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E*");
        obj1 = n;
        s1 = String.valueOf("\\p{Nd}");
        s = (new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(obj1).length() + String.valueOf(s1).length())).append(((String) (obj))).append(((String) (obj1))).append(s1).append("]*").toString();
        obj = String.valueOf("x\uFF58#\uFF03~\uFF5E");
        if (((String) (obj)).length() != 0)
        {
            obj = ",".concat(((String) (obj)));
        } else
        {
            obj = new String(",");
        }
        t = h(((String) (obj)));
        obj = t;
        u = Pattern.compile((new StringBuilder(String.valueOf(obj).length() + 5)).append("(?:").append(((String) (obj))).append(")$").toString(), 66);
        obj = s;
        obj1 = t;
        v = Pattern.compile((new StringBuilder(String.valueOf(obj).length() + 5 + String.valueOf(obj1).length())).append(((String) (obj))).append("(?:").append(((String) (obj1))).append(")?").toString(), 66);
    }
}
