// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import com.google.api.client.http.GenericUrl;
import java.util.Locale;

public abstract class cud extends cwm
{

    private static final long serialVersionUID = 1L;

    public cud()
    {
    }

    public String a()
    {
        return "ui_queue";
    }

    public boolean a(cdn cdn, dcx dcx)
    {
        return false;
    }

    public GenericUrl b(Context context)
    {
        String s = g.a(context, "babel_google_voice_api_key", "AIzaSyAMX775bK7F5ciFA6w9pXNJyvzqcSPeHH0");
        context = super.b(context);
        context.put("key", s);
        context.put("locale", Locale.getDefault().toString());
        return context;
    }

    protected dmi g()
    {
        return dmi.e;
    }
}
