// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class cpa
{

    private static final cpd a = cpd.a("=").a();
    private static final cpd b = cpd.a("/").a();
    private static final cpc c = new cpc("/");
    private static final Pattern d = Pattern.compile("^((http(s)?):)?\\/\\/((((lh[3-6]\\.((ggpht)|(googleusercontent)|(google)))|([1-4]\\.bp\\.blogspot)|(bp[0-3]\\.blogger))\\.com)|(www\\.google\\.com\\/visualsearch\\/lh))\\/");

    public static Uri a(String s, String s1)
    {
        boolean flag1 = true;
        if (s1 == null)
        {
            return null;
        }
        boolean flag2;
        if (s1 == null)
        {
            flag2 = false;
        } else
        {
            flag2 = d.matcher(s1).find();
        }
        if (!flag2)
        {
            return Uri.parse(s1);
        }
        s1 = Uri.parse(s1);
        ArrayList arraylist = a(b.a(s1.getPath()));
        int i = arraylist.size();
        if (arraylist.size() > 1 && ((String)arraylist.get(0)).equals("image"))
        {
            i--;
        }
        if (i >= 4 && i <= 6)
        {
            String s2 = s1.getPath();
            Object obj = a(b.a(s2));
            boolean flag;
            int j;
            boolean flag3;
            if (((List) (obj)).size() > 0 && ((String)((List) (obj)).get(0)).equals("image"))
            {
                ((List) (obj)).remove(0);
                i = 1;
            } else
            {
                i = 0;
            }
            j = ((List) (obj)).size();
            flag3 = s2.endsWith("/");
            if (!flag3 && j == 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (j != 4)
            {
                flag1 = false;
            }
            if (flag)
            {
                ((List) (obj)).add(((List) (obj)).get(4));
            }
            if (flag1)
            {
                ((List) (obj)).add(s);
            } else
            {
                ((List) (obj)).set(4, s);
            }
            if (i != 0)
            {
                ((List) (obj)).add(0, "image");
            }
            if (flag3)
            {
                ((List) (obj)).add("");
            }
            s1 = s1.buildUpon();
            s = String.valueOf(c.a(new StringBuilder(), ((Iterable) (obj))).toString());
            if (s.length() != 0)
            {
                s = "/".concat(s);
            } else
            {
                s = new String("/");
            }
            return s1.path(s).build();
        }
        if (i == 1)
        {
            obj = (String)a(a.a(s1.getPath())).get(0);
            s = (new StringBuilder(String.valueOf(obj).length() + 1 + String.valueOf(s).length())).append(((String) (obj))).append("=").append(s).toString();
            return s1.buildUpon().path(s).build();
        } else
        {
            return s1;
        }
    }

    private static ArrayList a(Iterable iterable)
    {
        if (!(iterable instanceof Collection)) goto _L2; else goto _L1
_L1:
        iterable = new ArrayList((Collection)iterable);
_L4:
        return iterable;
_L2:
        Iterator iterator = iterable.iterator();
        ArrayList arraylist = new ArrayList();
        do
        {
            iterable = arraylist;
            if (!iterator.hasNext())
            {
                continue;
            }
            arraylist.add(iterator.next());
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

}
