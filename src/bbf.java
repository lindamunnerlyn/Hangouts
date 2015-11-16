// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import java.io.File;

final class bbf
    implements gtd
{

    final bbd a;

    bbf(bbd bbd1)
    {
        a = bbd1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == -1)
        {
            intent = Uri.fromFile(new File(Environment.getExternalStorageDirectory(), ava.a(2)));
            intent = azt.b(bbd.d(a), intent.toString());
            bbd.b(a).a(g.ki, intent);
            return;
        } else
        {
            bbd.c(a);
            return;
        }
    }
}
