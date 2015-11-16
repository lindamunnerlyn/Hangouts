// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import org.chromium.net.UserAgent;

public final class hja extends hiv
{

    private final hhz b;

    public hja(Context context, String s, String s1, hhz hhz1)
    {
        super(context, s, s1);
        b = hhz1;
    }

    protected String a(Context context)
    {
        StringBuilder stringbuilder = new StringBuilder(UserAgent.a(context));
        stringbuilder.append("; G+ SDK/");
        if (b.f() == null)
        {
            context = "1.0.0";
        } else
        {
            context = b.f();
        }
        stringbuilder.append(context);
        stringbuilder.append(';');
        return stringbuilder.toString();
    }

    public Map a(String s)
    {
        Map map = super.a(s);
        Object obj = b;
        s = ((String) (obj));
        if (((hhz) (obj)).e() != null)
        {
            s = ((hhz) (obj)).e();
        }
        String s1;
        String s2;
        if (s.d() != null)
        {
            obj = s.d();
        } else
        {
            obj = "0";
        }
        s1 = s.b();
        s2 = s.a();
        s = s.c();
        obj = String.valueOf(Uri.encode(((String) (obj))));
        obj = Uri.parse((new StringBuilder(String.valueOf(obj).length() + 35)).append("http://").append(((String) (obj))).append(".apps.googleusercontent.com/").toString()).buildUpon();
        if (s1 != null)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("client_id", s1);
        }
        if (s2 != null)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("api_key", s2);
        }
        if (s != null)
        {
            ((android.net.Uri.Builder) (obj)).appendQueryParameter("pkg", s);
        }
        map.put("X-Container-Url", ((android.net.Uri.Builder) (obj)).build().toString());
        return map;
    }
}
