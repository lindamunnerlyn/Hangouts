// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.database.Cursor;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmm
    implements android.widget.PopupWindow.OnDismissListener
{

    final Cursor a;
    final Runnable b;
    final DebugActivity c;

    public cmm(DebugActivity debugactivity, Cursor cursor, Runnable runnable)
    {
        c = debugactivity;
        a = cursor;
        b = runnable;
        super();
    }

    public void onDismiss()
    {
        if (a != null)
        {
            a.close();
        }
        if (b != null)
        {
            b.run();
        }
    }
}
