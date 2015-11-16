// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import org.chromium.net.CronetUploadDataStream;

public final class lme
    implements Runnable
{

    final CronetUploadDataStream a;

    public lme(CronetUploadDataStream cronetuploaddatastream)
    {
        a = cronetuploaddatastream;
        super();
    }

    public void run()
    {
        CronetUploadDataStream.a(a);
    }
}
