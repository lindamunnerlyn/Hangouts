// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Environment;
import java.io.File;

final class cnm
    implements Runnable
{

    final cnl a;

    cnm(cnl cnl)
    {
        a = cnl;
        super();
    }

    public void run()
    {
        String s = String.valueOf(Environment.getExternalStorageDirectory());
        dtb.a(new File((new StringBuilder(String.valueOf(s).length() + 16)).append(s).append("/testapns.xml.gz").toString()));
    }
}
