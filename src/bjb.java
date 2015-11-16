// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.Toast;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class bjb
    implements android.view.View.OnClickListener
{

    final String a;
    final bja b;

    bjb(bja bja1, String s)
    {
        b = bja1;
        a = s;
        super();
    }

    public void onClick(View view)
    {
        view = view.getContext();
        if (!((chz)hgx.a(view, chz)).a("android.permission.WRITE_EXTERNAL_STORAGE"))
        {
            Toast.makeText(view, "Can't access file, please go to Settings to turn on the Storage permission.", 1).show();
        } else
        {
            b.a.a();
            if ("load".equals(biz.a(b.a)))
            {
                RealTimeChatService.d(a);
                return;
            }
            if ("email".equals(biz.a(b.a)))
            {
                biz.a(b.a, a);
                return;
            }
        }
    }
}
