// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

class aeq
{

    public final String a;
    public String b;
    public String c;
    public aer d;
    public final Set e;
    public final Set f;
    private final List g;
    private boolean h;

    public aeq()
    {
        int i1 = adr.b;
        this((byte)0);
    }

    public aeq(byte byte0)
    {
        g = new ArrayList();
        e = new HashSet();
        f = new HashSet();
        a = "ISO-8859-1";
    }

    private static boolean a(char c1)
    {
        return c1 >= 'a' && c1 <= 'z' || c1 >= 'A' && c1 <= 'Z';
    }

    private String e(String s)
    {
        Object obj = s;
        if (s.trim().endsWith("="))
        {
            int i1;
            for (i1 = s.length() - 1; s.charAt(i1) != '=';) { }
            obj = new StringBuilder();
            ((StringBuilder) (obj)).append(s.substring(0, i1 + 1));
            ((StringBuilder) (obj)).append("\r\n");
            do
            {
                s = a();
                if (s == null)
                {
                    throw new afb("File ended during parsing a Quoted-Printable String");
                }
                if (!s.trim().endsWith("="))
                {
                    break;
                }
                int j1;
                for (j1 = s.length() - 1; s.charAt(j1) != '=';) { }
                ((StringBuilder) (obj)).append(s.substring(0, j1 + 1));
                ((StringBuilder) (obj)).append("\r\n");
            } while (true);
            ((StringBuilder) (obj)).append(s);
            obj = ((StringBuilder) (obj)).toString();
        }
        return ((String) (obj));
    }

    private String f(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        do
        {
            s = b();
            if (s != null && s.length() != 0 && g(s) == null)
            {
                a();
                stringbuilder.append(" ").append(s);
            } else
            {
                return stringbuilder.toString();
            }
        } while (true);
    }

    private static String g(String s)
    {
        int i1 = s.indexOf(":");
        if (i1 < 0) goto _L2; else goto _L1
_L1:
        int j1 = s.indexOf(";");
        if (i1 != -1) goto _L4; else goto _L3
_L3:
        i1 = j1;
_L5:
        return s.substring(0, i1).toUpperCase();
_L4:
        if (j1 != -1)
        {
            i1 = Math.min(i1, j1);
        }
        if (true) goto _L5; else goto _L2
_L2:
        return null;
    }

    private boolean l()
    {
        b = "8BIT";
        c = "UTF-8";
        if (!a(false))
        {
            return false;
        }
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((aeo)iterator.next()).d()) { }
        d();
        for (Iterator iterator1 = g.iterator(); iterator1.hasNext(); ((aeo)iterator1.next()).e()) { }
        return true;
    }

    protected String a()
    {
        return d.readLine();
    }

    public void a(aeo aeo1)
    {
        g.add(aeo1);
    }

    protected void a(aev aev1)
    {
        Object obj;
        Object obj1;
        String s;
        obj1 = aev1.a().toUpperCase();
        s = aev1.c();
        obj = aev1.d("CHARSET");
        Object obj2;
        if (obj != null)
        {
            obj = (String)((Collection) (obj)).iterator().next();
        } else
        {
            obj = null;
        }
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            obj = "UTF-8";
        }
        if (!((String) (obj1)).equals("ADR") && !((String) (obj1)).equals("ORG") && !((String) (obj1)).equals("N")) goto _L2; else goto _L1
_L1:
        obj1 = new ArrayList();
        if (b.equals("QUOTED-PRINTABLE"))
        {
            obj2 = e(s);
            aev1.c(((String) (obj2)));
            for (obj2 = aex.a(((String) (obj2)), f()).iterator(); ((Iterator) (obj2)).hasNext(); ((List) (obj1)).add(aex.a((String)((Iterator) (obj2)).next(), "ISO-8859-1", ((String) (obj))))) { }
        } else
        {
            for (Iterator iterator1 = aex.a(f(s), f()).iterator(); iterator1.hasNext(); ((List) (obj1)).add(aex.b((String)iterator1.next(), "ISO-8859-1", ((String) (obj))))) { }
        }
        aev1.a(((List) (obj1)));
        for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).a(aev1)) { }
          goto _L3
_L2:
        if (!b.equals("QUOTED-PRINTABLE") && (!((String) (obj1)).equals("FN") || aev1.d("ENCODING") != null || !aex.a(s))) goto _L5; else goto _L4
_L4:
        obj1 = e(s);
        obj = aex.a(((String) (obj1)), "ISO-8859-1", ((String) (obj)));
        aev1.c(((String) (obj1)));
        aev1.a(new String[] {
            obj
        });
        for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).a(aev1)) { }
          goto _L3
_L5:
        if (!b.equals("BASE64") && !b.equals("B")) goto _L7; else goto _L6
_L6:
        obj = c(s);
        aev1.a(Base64.decode(((String) (obj)), 0));
        for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).a(aev1)) { }
          goto _L3
        obj;
        try
        {
            obj = String.valueOf(s);
            if (((String) (obj)).length() != 0)
            {
                obj = "Decode error on base64 photo: ".concat(((String) (obj)));
            } else
            {
                obj = new String("Decode error on base64 photo: ");
            }
            throw new afb(((String) (obj)));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e("vCard", "OutOfMemoryError happened during parsing BASE64 data!");
            for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).a(aev1)) { }
        }
          goto _L3
_L7:
        if (!b.equals("7BIT") && !b.equals("8BIT") && !b.startsWith("X-"))
        {
            String.format("The encoding \"%s\" is unsupported by vCard %s", new Object[] {
                b, g()
            });
        }
        if (f() != 0) goto _L9; else goto _L8
_L8:
        obj1 = null;
        do
        {
            String s1 = b();
            if (TextUtils.isEmpty(s1) || s1.charAt(0) != ' ' || "END:VCARD".contains(s1.toUpperCase()))
            {
                break;
            }
            a();
            StringBuilder stringbuilder = ((StringBuilder) (obj1));
            if (obj1 == null)
            {
                stringbuilder = new StringBuilder();
                stringbuilder.append(s);
            }
            stringbuilder.append(s1.substring(1));
            obj1 = stringbuilder;
        } while (true);
        if (obj1 == null) goto _L9; else goto _L10
_L10:
        obj1 = ((StringBuilder) (obj1)).toString();
_L12:
        ArrayList arraylist = new ArrayList();
        arraylist.add(aex.b(d(((String) (obj1))), "ISO-8859-1", ((String) (obj))));
        aev1.a(arraylist);
        for (Iterator iterator = g.iterator(); iterator.hasNext(); ((aeo)iterator.next()).a(aev1)) { }
_L3:
        return;
_L9:
        obj1 = s;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected void a(aev aev1, String s)
    {
        Object obj = s.split("=", 2);
        if (obj.length == 2)
        {
            s = obj[0].trim().toUpperCase();
            obj = obj[1].trim();
            if (s.equals("TYPE"))
            {
                c(aev1, ((String) (obj)));
                return;
            }
            if (s.equals("VALUE"))
            {
                d(aev1, ((String) (obj)));
                return;
            }
            if (s.equals("ENCODING"))
            {
                e(aev1, ((String) (obj)));
                return;
            }
            if (s.equals("CHARSET"))
            {
                f(aev1, ((String) (obj)));
                return;
            }
            if (s.equals("LANGUAGE"))
            {
                g(aev1, ((String) (obj)));
                return;
            }
            if (s.startsWith("X-"))
            {
                a(aev1, s, ((String) (obj)));
                return;
            } else
            {
                throw new afb((new StringBuilder(String.valueOf(s).length() + 15)).append("Unknown type \"").append(s).append("\"").toString());
            }
        } else
        {
            b(aev1, obj[0]);
            return;
        }
    }

    protected void a(aev aev1, String s, String s1)
    {
        aev1.a(s, s1);
    }

    public void a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            throw new NullPointerException("InputStream must not be null.");
        }
        d = new aer(new InputStreamReader(inputstream, a));
        System.currentTimeMillis();
        for (inputstream = g.iterator(); inputstream.hasNext(); ((aeo)inputstream.next()).a()) { }
_L4:
        this;
        JVM INSTR monitorenter ;
        if (!h) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
_L3:
        for (inputstream = g.iterator(); inputstream.hasNext(); ((aeo)inputstream.next()).b()) { }
        break MISSING_BLOCK_LABEL_142;
_L2:
        this;
        JVM INSTR monitorexit ;
        if (l()) goto _L4; else goto _L3
        inputstream;
        this;
        JVM INSTR monitorexit ;
        throw inputstream;
    }

    protected boolean a(String s)
    {
        if (!h().contains(s.toUpperCase()) && !s.startsWith("X-") && !e.contains(s))
        {
            e.add(s);
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                "Property name unsupported by vCard 2.1: ".concat(s);
            } else
            {
                new String("Property name unsupported by vCard 2.1: ");
            }
        }
        return true;
    }

    protected boolean a(boolean flag)
    {
        do
        {
            String s;
            do
            {
                s = a();
                if (s == null)
                {
                    return false;
                }
            } while (s.trim().length() <= 0);
            String as[] = s.split(":", 2);
            if (as.length == 2 && as[0].trim().equalsIgnoreCase("BEGIN") && as[1].trim().equalsIgnoreCase("VCARD"))
            {
                return true;
            }
            if (!flag)
            {
                String s1 = String.valueOf("Expected String \"BEGIN:VCARD\" did not come (Instead, \"");
                throw new afb((new StringBuilder(String.valueOf(s1).length() + 7 + String.valueOf(s).length())).append(s1).append(s).append("\" came)").toString());
            }
        } while (flag);
        throw new afb("Reached where must not be reached.");
    }

    protected aev b(String s)
    {
        aev aev1;
        int j1;
        int k1;
        int l1;
        int i2;
        l1 = 0;
        aev1 = new aev();
        i2 = s.length();
        if (i2 > 0 && s.charAt(0) == '#')
        {
            throw new afc();
        }
        k1 = 0;
        j1 = 0;
_L6:
        char c1;
        if (k1 >= i2)
        {
            break MISSING_BLOCK_LABEL_373;
        }
        c1 = s.charAt(k1);
        j1;
        JVM INSTR tableswitch 0 2: default 88
    //                   0 105
    //                   1 228
    //                   2 341;
           goto _L1 _L2 _L3 _L4
_L2:
        break; /* Loop/switch isn't completed */
_L4:
        break MISSING_BLOCK_LABEL_341;
_L1:
        int i1 = l1;
_L7:
        k1++;
        l1 = i1;
        if (true) goto _L6; else goto _L5
_L5:
        if (c1 == ':')
        {
            aev1.a(s.substring(l1, k1));
            if (k1 < i2 - 1)
            {
                s = s.substring(k1 + 1);
            } else
            {
                s = "";
            }
            aev1.c(s);
            return aev1;
        }
        if (c1 == '.')
        {
            String s1 = s.substring(l1, k1);
            if (s1.length() != 0)
            {
                aev1.b(s1);
            }
            i1 = k1 + 1;
        } else
        {
            i1 = l1;
            if (c1 == ';')
            {
                aev1.a(s.substring(l1, k1));
                i1 = k1 + 1;
                j1 = 1;
            }
        }
          goto _L7
_L3:
        if (c1 == '"')
        {
            "2.1".equalsIgnoreCase(g());
            j1 = 2;
            i1 = l1;
        } else
        {
label0:
            {
                if (c1 != ';')
                {
                    break label0;
                }
                a(aev1, s.substring(l1, k1));
                i1 = k1 + 1;
            }
        }
          goto _L7
        i1 = l1;
        if (c1 != ':') goto _L7; else goto _L8
_L8:
        a(aev1, s.substring(l1, k1));
        if (k1 < i2 - 1)
        {
            s = s.substring(k1 + 1);
        } else
        {
            s = "";
        }
        aev1.c(s);
        return aev1;
        i1 = l1;
        if (c1 == '"')
        {
            "2.1".equalsIgnoreCase(g());
            j1 = 1;
            i1 = l1;
        }
          goto _L7
        throw new afd((new StringBuilder(String.valueOf(s).length() + 16)).append("Invalid line: \"").append(s).append("\"").toString());
    }

    protected String b()
    {
        return d.a();
    }

    protected void b(aev aev1)
    {
        if (!aev1.c().toUpperCase().contains("BEGIN:VCARD"))
        {
            for (Iterator iterator = g.iterator(); iterator.hasNext(); ((aeo)iterator.next()).a(aev1)) { }
        } else
        {
            throw new afa("AGENT Property is not supported now.");
        }
    }

    protected void b(aev aev1, String s)
    {
        c(aev1, s);
    }

    protected String c()
    {
        String s;
        do
        {
            s = a();
            if (s == null)
            {
                throw new afb("Reached end of buffer.");
            }
        } while (s.trim().length() <= 0);
        return s;
    }

    protected String c(String s)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        stringbuilder.append(s);
_L6:
        String s1;
        s = b();
        if (s == null)
        {
            throw new afb("File ended during parsing BASE64 binary");
        }
        s1 = g(s);
        if (!h().contains(s1)) goto _L2; else goto _L1
_L1:
        s = String.valueOf(s.trim());
        if (s.length() != 0)
        {
            "Problematic line: ".concat(s);
        } else
        {
            new String("Problematic line: ");
        }
_L4:
        return stringbuilder.toString();
_L2:
        a();
        if (s.length() == 0) goto _L4; else goto _L3
_L3:
        stringbuilder.append(s);
        if (true) goto _L6; else goto _L5
_L5:
    }

    protected void c(aev aev1, String s)
    {
        if (!i().contains(s.toUpperCase()) && !s.startsWith("X-") && !e.contains(s))
        {
            e.add(s);
            String.format("TYPE unsupported by %s: ", new Object[] {
                Integer.valueOf(f()), s
            });
        }
        aev1.a("TYPE", s);
    }

    protected String d(String s)
    {
        return s;
    }

    protected void d()
    {
        boolean flag = false;
        boolean flag1;
        try
        {
            flag1 = e();
        }
        catch (afc afc1)
        {
            Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
            continue; /* Loop/switch isn't completed */
        }
        flag = flag1;
_L2:
        if (flag)
        {
            break; /* Loop/switch isn't completed */
        }
        flag1 = e();
        flag = flag1;
        continue; /* Loop/switch isn't completed */
        afc afc2;
        afc2;
        Log.e("vCard", "Invalid line which looks like some comment was found. Ignored.");
        if (true) goto _L2; else goto _L1
_L1:
    }

    protected void d(aev aev1, String s)
    {
        if (!j().contains(s.toUpperCase()) && !s.startsWith("X-") && !f.contains(s))
        {
            f.add(s);
            String.format("The value unsupported by TYPE of %s: ", new Object[] {
                Integer.valueOf(f()), s
            });
        }
        aev1.a("VALUE", s);
    }

    protected void e(aev aev1, String s)
    {
        if (k().contains(s) || s.startsWith("X-"))
        {
            aev1.a("ENCODING", s);
            b = s.toUpperCase();
            return;
        } else
        {
            throw new afb((new StringBuilder(String.valueOf(s).length() + 19)).append("Unknown encoding \"").append(s).append("\"").toString());
        }
    }

    protected boolean e()
    {
        b = "8BIT";
        Object obj = b(c());
        String s = ((aev) (obj)).a().toUpperCase();
        String s1 = ((aev) (obj)).c();
        if (s.equals("BEGIN"))
        {
            if (s1.equalsIgnoreCase("VCARD"))
            {
                for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).d()) { }
                d();
                for (obj = g.iterator(); ((Iterator) (obj)).hasNext(); ((aeo)((Iterator) (obj)).next()).e()) { }
            } else
            {
                obj = String.valueOf(s1);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unknown BEGIN type: ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unknown BEGIN type: ");
                }
                throw new afb(((String) (obj)));
            }
        } else
        {
            if (s.equals("END"))
            {
                if (s1.equalsIgnoreCase("VCARD"))
                {
                    return true;
                }
                obj = String.valueOf(s1);
                if (((String) (obj)).length() != 0)
                {
                    obj = "Unknown END type: ".concat(((String) (obj)));
                } else
                {
                    obj = new String("Unknown END type: ");
                }
                throw new afb(((String) (obj)));
            }
            s1 = ((aev) (obj)).c();
            if (s.equals("AGENT"))
            {
                b(((aev) (obj)));
            } else
            {
                a(s);
                if (s.equals("VERSION") && !s1.equals(g()))
                {
                    obj = g();
                    throw new afg((new StringBuilder(String.valueOf(s1).length() + 26 + String.valueOf(obj).length())).append("Incompatible version: ").append(s1).append(" != ").append(((String) (obj))).toString());
                }
                a(((aev) (obj)));
            }
        }
        return false;
    }

    protected int f()
    {
        return 0;
    }

    protected void f(aev aev1, String s)
    {
        c = s;
        aev1.a("CHARSET", s);
    }

    protected String g()
    {
        return "2.1";
    }

    protected void g(aev aev1, String s)
    {
        boolean flag = false;
        String as[] = s.split("-");
        if (as.length != 2)
        {
            throw new afb((new StringBuilder(String.valueOf(s).length() + 20)).append("Invalid Language: \"").append(s).append("\"").toString());
        }
        String s2 = as[0];
        int k1 = s2.length();
        for (int i1 = 0; i1 < k1; i1++)
        {
            if (!a(s2.charAt(i1)))
            {
                throw new afb((new StringBuilder(String.valueOf(s).length() + 20)).append("Invalid Language: \"").append(s).append("\"").toString());
            }
        }

        String s1 = as[1];
        k1 = s1.length();
        for (int j1 = ((flag) ? 1 : 0); j1 < k1; j1++)
        {
            if (!a(s1.charAt(j1)))
            {
                throw new afb((new StringBuilder(String.valueOf(s).length() + 20)).append("Invalid Language: \"").append(s).append("\"").toString());
            }
        }

        aev1.a("LANGUAGE", s);
    }

    protected Set h()
    {
        return aet.a;
    }

    protected Set i()
    {
        return aet.b;
    }

    protected Set j()
    {
        return aet.c;
    }

    protected Set k()
    {
        return aet.d;
    }
}
