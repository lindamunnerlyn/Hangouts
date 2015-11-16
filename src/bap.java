// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import java.io.File;

final class bap
    implements gov
{

    final ban a;

    bap(ban ban1)
    {
        a = ban1;
        super();
    }

    public void a(int i, Intent intent)
    {
        if (i == -1)
        {
            intent = Uri.fromFile(new File(Environment.getExternalStorageDirectory(), auj.a(2)));
            intent = azg.b(ban.d(a), intent.toString());
            ban.b(a).a(g.kp, intent);
            return;
        } else
        {
            ban.c(a);
            return;
        }
    }
}
