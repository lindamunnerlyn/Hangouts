// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.hangouts.realtimechat.wakelock.impl.DebugWakelocksActivity;
import java.util.LinkedHashMap;

public final class dlj
    implements android.widget.AdapterView.OnItemClickListener
{

    final DebugWakelocksActivity a;

    dlj(DebugWakelocksActivity debugwakelocksactivity)
    {
        a = debugwakelocksactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = new dlk(this, (Intent)((jnw)adapterview.getItemAtPosition(i)).a);
        view = a.getLayoutInflater().inflate(h.ja, null);
        ((ListView)view.findViewById(0x102000a)).setAdapter(new dll(a, h.b(adapterview.keySet()), h.b(adapterview.values())));
        (new android.app.AlertDialog.Builder(a)).setView(view).show();
    }
}
