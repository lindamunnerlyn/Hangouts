// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Patterns;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class bhv
    implements Serializable
{

    private static boolean a = false;
    private String b;
    private String c;
    private String d;
    private final List e;
    private List f;

    public bhv()
    {
        e = new ArrayList();
        f = new ArrayList();
    }

    public bhv(bia bia1)
    {
        this(null, null, null, ((Iterable) (Arrays.asList(new bia[] {
            bia1
        }))), null, null);
    }

    public bhv(String s, String s1, String s2, Iterable iterable, Iterable iterable1, Iterable iterable2)
    {
        e = new ArrayList();
        f = new ArrayList();
        b = s;
        c = s1;
        if (!TextUtils.isEmpty(c))
        {
            s = c;
            f.add(new bhz(s));
        }
        d = s2;
        if (iterable2 != null)
        {
            for (s = iterable2.iterator(); s.hasNext(); e.add(s1))
            {
                s1 = (Long)s.next();
            }

        }
        if (iterable1 != null)
        {
            for (s = iterable1.iterator(); s.hasNext(); f.add(s1))
            {
                s1 = (bhy)s.next();
            }

        }
        if (iterable != null)
        {
            for (s = iterable.iterator(); s.hasNext(); f.add(s1))
            {
                s1 = (bia)s.next();
            }

        }
    }

    public static bhv a(fth fth1)
    {
        return a(fth1, null);
    }

    public static bhv a(fth fth1, String s)
    {
        ArrayList arraylist = new ArrayList();
        arraylist.add(fth1);
        return a(((List) (arraylist)), s);
    }

    public static bhv a(List list)
    {
        return a(list, null);
    }

    private static bhv a(List list, String s)
    {
        if (list == null || list.size() == 0)
        {
            return null;
        }
        Object obj = (fth)list.get(0);
        String s1 = ((fth) (obj)).a();
        String s9 = ((fth) (obj)).e();
        String s2 = ((fth) (obj)).h();
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        ArrayList arraylist2 = new ArrayList();
        HashSet hashset;
        Iterator iterator2;
        boolean flag;
        if (s == null)
        {
            obj = null;
        } else
        {
            obj = eey.k(s);
        }
        hashset = new HashSet();
        iterator2 = list.iterator();
        list = s1;
        flag = false;
        s1 = s2;
        while (iterator2.hasNext()) 
        {
            fth fth1 = (fth)iterator2.next();
            if (a)
            {
                String s3 = String.valueOf(fth1.a());
                String s7 = String.valueOf(fth1.e());
                eev.b("Babel", (new StringBuilder(String.valueOf(s3).length() + 37 + String.valueOf(s7).length() + String.valueOf(s).length())).append("Aggregated contact:").append(s3).append(" Gaia:").append(s7).append(" Only phone:").append(s).toString());
            }
            if (fth1.f())
            {
                String s4 = fth1.a();
                String s8 = fth1.h();
                list = s4;
                if (!TextUtils.isEmpty(s8))
                {
                    s1 = s8;
                    list = s4;
                }
            }
            for (Iterator iterator = fth1.b().iterator(); iterator.hasNext();)
            {
                Long long1 = (Long)iterator.next();
                String s5 = s1;
                if (TextUtils.isEmpty(s1))
                {
                    s5 = dou.a(long1);
                }
                arraylist.add(long1);
                s1 = s5;
            }

            Iterator iterator1 = fth1.c().iterator();
            while (iterator1.hasNext()) 
            {
                ftk ftk1 = (ftk)iterator1.next();
                if (a)
                {
                    String s6 = String.valueOf(ftk1.b());
                    if (s6.length() != 0)
                    {
                        s6 = "Email:".concat(s6);
                    } else
                    {
                        s6 = new String("Email:");
                    }
                    eev.b("Babel", s6);
                }
                arraylist2.add(new bhy(ftk1.b(), ftk1.a()));
            }
            iterator1 = fth1.d().iterator();
            while (iterator1.hasNext()) 
            {
                Object obj1 = (ftq)iterator1.next();
                String s10 = ((ftq) (obj1)).b();
                String s11 = eey.k(s10);
                if (hashset.contains(s11))
                {
                    if (a)
                    {
                        obj1 = String.valueOf(s10);
                        if (((String) (obj1)).length() != 0)
                        {
                            obj1 = "Skip duplicate phone:".concat(((String) (obj1)));
                        } else
                        {
                            obj1 = new String("Skip duplicate phone:");
                        }
                        eev.b("Babel", ((String) (obj1)));
                    }
                } else
                {
                    hashset.add(s11);
                    if (obj == null || ((String) (obj)).equals(s11))
                    {
                        arraylist1.add(new bia(s10, ((ftq) (obj1)).a()));
                        flag = true;
                    }
                }
            }
        }
        if (obj != null && !flag)
        {
            s = String.valueOf(s);
            if (s.length() != 0)
            {
                s = "Only phone number to include not found:".concat(s);
            } else
            {
                s = new String("Only phone number to include not found:");
            }
            eev.g("Babel", s);
        }
        return new bhv(list, s9, s1, arraylist1, arraylist2, arraylist);
    }

    public static boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && Patterns.EMAIL_ADDRESS.matcher(s).matches();
    }

    public static String b(String s)
    {
        return eey.k(s);
    }

    public static boolean b(fth fth1)
    {
        fth1 = fth1.d();
        boolean flag;
        if (fth1 instanceof Collection)
        {
            flag = ((Collection)fth1).isEmpty();
        } else
        if (!fth1.iterator().hasNext())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return !flag;
    }

    public static String c(fth fth1)
    {
        Iterator iterator = fth1.c().iterator();
        if (iterator.hasNext())
        {
            return ((ftk)iterator.next()).b();
        }
        fth1 = fth1.d().iterator();
        if (fth1.hasNext())
        {
            return ((ftq)fth1.next()).b();
        } else
        {
            return null;
        }
    }

    public static boolean c(String s)
    {
        boolean flag;
        try
        {
            if (!TextUtils.isEmpty(s))
            {
                flag = PhoneNumberUtils.isWellFormedSmsAddress(s);
                break MISSING_BLOCK_LABEL_12;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return true;
        }
        return true;
        if (flag && !dtp.a().a(s))
        {
            s = PhoneNumberUtils.extractNetworkPortion(s);
            if (!TextUtils.isEmpty(s) && s.length() >= 3)
            {
                return false;
            }
        }
        break MISSING_BLOCK_LABEL_16;
    }

    public long a()
    {
        if (!e.isEmpty())
        {
            return g.a((Long)e.get(0), 0L);
        } else
        {
            return -1L;
        }
    }

    public String b()
    {
        return c;
    }

    public String c()
    {
        return b;
    }

    public String d()
    {
        return d;
    }

    public bia e()
    {
        for (Iterator iterator = f.iterator(); iterator.hasNext();)
        {
            bhx bhx1 = (bhx)iterator.next();
            if (bhx1 instanceof bia)
            {
                return (bia)bhx1;
            }
        }

        return null;
    }

    public List f()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bhx bhx1 = (bhx)iterator.next();
            if (bhx1 instanceof bia)
            {
                arraylist.add((bia)bhx1);
            }
        } while (true);
        return arraylist;
    }

    public List g()
    {
        ArrayList arraylist = new ArrayList();
        Iterator iterator = f.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            bhx bhx1 = (bhx)iterator.next();
            if (bhx1 instanceof bhy)
            {
                arraylist.add((bhy)bhx1);
            }
        } while (true);
        return arraylist;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("Number of details ").append(f.size()).append("\n");
        for (Iterator iterator = f.iterator(); iterator.hasNext(); stringbuilder.append((bhx)iterator.next()).append("\n")) { }
        return stringbuilder.toString();
    }

    static 
    {
        hnc hnc = eev.e;
    }
}
