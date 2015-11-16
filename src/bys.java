// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Locale;

public final class bys extends eib
{

    public bys(Context context)
    {
        this(context, (byte)0);
    }

    private bys(Context context, byte byte0)
    {
        super(context, null);
    }

    private static String a(String s, String s1)
    {
        return s1.substring(s.length());
    }

    public static boolean b(String s)
    {
        boolean flag1 = false;
        String s1;
        boolean flag;
        boolean flag2;
        try
        {
            s1 = (new URL(s)).getHost().toLowerCase(Locale.getDefault());
            if (s1.equals("www.youtube.com") || s1.equals("youtube.com") || s1.equals("m.youtube.com") || s1.equals("youtube.googleapis.com"))
            {
                break MISSING_BLOCK_LABEL_67;
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        flag = flag1;
        if (!s1.equals("youtu.be"))
        {
            break MISSING_BLOCK_LABEL_85;
        }
        flag2 = TextUtils.isEmpty(d(s));
        flag = flag1;
        if (!flag2)
        {
            flag = true;
        }
        return flag;
    }

    private static String d(String s)
    {
        int i = 0;
        Object obj;
        String s1;
        obj = new URL(s);
        s1 = ((URL) (obj)).getPath();
        if (TextUtils.isEmpty(s1))
        {
            return null;
        }
        if (!s1.equals("/watch") && !s1.equals("/apiplayer")) goto _L2; else goto _L1
_L1:
        String s2 = ((URL) (obj)).getQuery();
        if (TextUtils.isEmpty(s2))
        {
            return null;
        }
        String as[];
        int j;
        as = s2.split("&");
        j = as.length;
_L5:
        if (i >= j) goto _L2; else goto _L3
_L3:
        String as1[];
        as1 = as[i].split("=");
        break MISSING_BLOCK_LABEL_87;
_L2:
        if (((URL) (obj)).getHost().toLowerCase(Locale.getDefault()).equals("youtu.be"))
        {
            return a("/", s1);
        }
        if (s1.startsWith("/embed/"))
        {
            return a("/embed/", s1);
        }
        if (!s1.startsWith("/v/"))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        obj = a("/v/", s1);
        return ((String) (obj));
        malformedurlexception;
        s = String.valueOf(s);
        if (s.length() != 0)
        {
            s = "Malformed url found trying to discover if youtube link for ".concat(s);
        } else
        {
            s = new String("Malformed url found trying to discover if youtube link for ");
        }
        eev.e("Babel", s, malformedurlexception);
        return null;
        MalformedURLException malformedurlexception;
        if (as1.length == 2 && (s1.equals("/watch") && as1[0].equals("v") || s1.equals("/apiplayer") && as1[0].equals("video_id")))
        {
            return as1[1];
        }
        i++;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public void a(int i, boolean flag, String s)
    {
        d(s);
        setOnClickListener(new byt(this, s));
        aoa aoa = dcn.e(i);
        String s1 = d(s);
        if (TextUtils.isEmpty(s1))
        {
            eev.g("Babel", "Found no videoId when trying to get the thumbnail for the yotube video");
        } else
        {
            s = new StringBuilder(s.substring(0, s.indexOf(':')));
            s.append("://img.youtube.com/vi/");
            s.append(s1);
            s.append("/0.jpg");
            s = s.toString();
        }
        super.a(aoa, flag, s, 480, 360, 0);
    }

    public void a(String s)
    {
    }

    public void b()
    {
        super.b();
    }
}
