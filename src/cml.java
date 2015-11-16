// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

public final class cml
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final DebugActivity a;

    public cml(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (Intent)adapterview.getItemAtPosition(i);
        return DebugActivity.a(a, RealTimeChatService.a(adapterview, DebugActivity.b(a)));
    }
}
