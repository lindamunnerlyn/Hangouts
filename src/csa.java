// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.api.client.http.GenericUrl;
import java.util.Locale;

public abstract class csa extends cui
{

    private static final long serialVersionUID = 1L;

    public csa()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public boolean a(cci cci, dbo dbo)
    {
        return false;
    }

    protected String f()
    {
        String s = String.valueOf("https://www.googleapis.com/voice/v1/");
        String s1 = String.valueOf(g());
        if (s1.length() != 0)
        {
            return s.concat(s1);
        } else
        {
            return new String(s);
        }
    }

    public GenericUrl h()
    {
        String s = g.a(g.nS, "babel_google_voice_api_key", "AIzaSyAMX775bK7F5ciFA6w9pXNJyvzqcSPeHH0");
        GenericUrl genericurl = super.h();
        genericurl.put("key", s);
        genericurl.put("locale", Locale.getDefault().toString());
        return genericurl;
    }
}
