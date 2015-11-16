// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.google.android.apps.hangouts.phone.DebugActivity;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;
import com.google.android.apps.hangouts.requestwriter.RequestWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class cmk
    implements android.widget.AdapterView.OnItemClickListener
{

    final DebugActivity a;

    public cmk(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Intent intent = (Intent)adapterview.getItemAtPosition(i);
        View view1 = a.getLayoutInflater().inflate(g.fK, null);
        ListView listview = (ListView)view1.findViewById(0x102000a);
        Bundle bundle = intent.getExtras();
        ArrayList arraylist = new ArrayList(bundle.keySet());
        ArrayList arraylist1 = new ArrayList();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); arraylist1.add(view))
        {
            Object obj = bundle.get((String)iterator.next());
            view = ((View) (obj));
            if (obj == null)
            {
                view = "NULL";
            }
        }

        adapterview = RequestWriter.a(adapterview.getContext(), intent, DebugActivity.b(a).h());
        if (adapterview != null)
        {
            arraylist.add("Server Request");
            arraylist1.add(adapterview);
        }
        adapterview = RealTimeChatService.b(intent);
        if (adapterview != null)
        {
            arraylist.add("Server Response");
            arraylist1.add(adapterview);
        }
        adapterview = dmw.a(intent, DebugActivity.b(a), false);
        if (adapterview != null)
        {
            arraylist.add("Server Update");
            arraylist1.add(adapterview);
        }
        listview.setAdapter(DebugActivity.a(a, arraylist, arraylist1));
        listview.setOnItemClickListener(DebugActivity.k(a));
        listview.setOnItemLongClickListener(DebugActivity.l(a));
        DebugActivity.a(a, view1, null, null);
    }
}
