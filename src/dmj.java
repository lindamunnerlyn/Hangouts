// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import java.io.File;
import org.chromium.net.HttpUrlRequestFactoryConfig;
import org.chromium.net.UrlRequestContextConfig;

final class dmj
{

    private final ber a = (new bes()).a("hangouts_rpc").b("Module containing code for making rpcs to datamixer.").a(true).a();

    public dmj()
    {
    }

    public hin a(Context context)
    {
        return (hin)a.a(context, new dmh(context));
    }

    public ber[] a()
    {
        return (new ber[] {
            a
        });
    }

    public dmh b(Context context)
    {
        return (dmh)a.a(context, new dmh(context));
    }

    public UrlRequestContextConfig c(Context context)
    {
        File file = new File(context.getCacheDir(), "cronet_cache");
        file.mkdir();
        return ((UrlRequestContextConfig)a.a(context, (new HttpUrlRequestFactoryConfig()).a(file.getPath()).a(2, 0x100000L).a(true))).b("www.googleapis.com");
    }
}
