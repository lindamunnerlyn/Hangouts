// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import org.chromium.net.HttpUrlRequestFactoryConfig;
import org.chromium.net.UrlRequestContextConfig;

final class dkr
{

    private final beb a = (new bec()).a("hangouts_rpc").b("Module containing code for making rpcs to datamixer.").a(true).a();

    public dkr()
    {
    }

    public hdw a(Context context)
    {
        return (hdw)a.a(context, new dkq());
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }

    public UrlRequestContextConfig b(Context context)
    {
        File file = new File(context.getCacheDir(), "cronet_cache");
        file.mkdir();
        return ((UrlRequestContextConfig)a.a(context, (new HttpUrlRequestFactoryConfig()).a(file.getPath()).a(org.chromium.net.UrlRequestContextConfig.HttpCache.c, 0x100000L).a(true))).b("www.googleapis.com");
    }
}
