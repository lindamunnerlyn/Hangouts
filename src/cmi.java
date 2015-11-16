// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.AdapterView;
import com.google.android.apps.hangouts.phone.DebugActivity;

public final class cmi
    implements android.widget.AdapterView.OnItemLongClickListener
{

    final DebugActivity a;

    public cmi(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = (cmu)adapterview.getItemAtPosition(i);
        adapterview = DebugActivity.a(((cmu) (adapterview)).a, ((cmu) (adapterview)).b);
        return DebugActivity.a(a, adapterview);
    }
}
