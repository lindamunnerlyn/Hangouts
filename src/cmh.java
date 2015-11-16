// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.google.android.apps.hangouts.phone.DebugActivity;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public final class cmh
    implements android.widget.AdapterView.OnItemClickListener
{

    final DebugActivity a;

    public cmh(DebugActivity debugactivity)
    {
        a = debugactivity;
        super();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        Object obj = ((cmu)adapterview.getItemAtPosition(i)).b;
        if (obj == null || obj.getClass().isPrimitive() || (obj instanceof CharSequence))
        {
            if (obj != null)
            {
                Toast.makeText(a, obj.toString(), 0).show();
            }
            return;
        }
        adapterview = a.getLayoutInflater().inflate(g.fK, null);
        view = (ListView)adapterview.findViewById(0x102000a);
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        if (obj instanceof List)
        {
            obj = (List)obj;
            for (i = 0; i < ((List) (obj)).size(); i++)
            {
                arraylist.add(String.valueOf(i));
                arraylist1.add(((List) (obj)).get(i));
            }

        } else
        {
            Field afield[] = obj.getClass().getFields();
            int j = afield.length;
            i = 0;
            while (i < j) 
            {
                Field field = afield[i];
                arraylist.add(field.getName());
                try
                {
                    arraylist1.add(field.get(obj));
                }
                catch (Exception exception)
                {
                    arraylist1.add("???");
                }
                i++;
            }
        }
        view.setAdapter(DebugActivity.a(a, arraylist, arraylist1));
        view.setOnItemClickListener(DebugActivity.k(a));
        view.setOnItemLongClickListener(DebugActivity.l(a));
        DebugActivity.a(a, adapterview, null, null);
    }
}
