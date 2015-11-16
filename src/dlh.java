// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.widget.TextView;

final class dlh extends TextView
{

    final dlg a;

    dlh(dlg dlg, Context context)
    {
        a = dlg;
        super(context);
        setText("Map from wakelock id to how long that wakelock has been held. Click a row to see the details of the intent holding the wakelock.");
        setPadding(20, 20, 20, 20);
    }
}
