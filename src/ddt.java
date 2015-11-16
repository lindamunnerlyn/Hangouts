// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Arrays;

final class ddt extends AsyncTask
{

    final int a;
    final dds b;

    ddt(dds dds1, int i)
    {
        b = dds1;
        a = i;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        java.util.List list;
        byte byte0;
        if (b.b.getCheckedRadioButtonId() == h.ej)
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        list = Arrays.asList(new String[] {
            b.c.getText().toString()
        });
        if (b.d.isChecked())
        {
            aobj = Integer.valueOf(2);
        } else
        {
            aobj = null;
        }
        return cuo.a(a, byte0, ((Integer) (aobj)), list);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (cuo)obj;
        if (!((cuo) (obj)).m())
        {
            obj = (dfw)((cuo) (obj)).e();
            b.a.setText(((dfw) (obj)).h.toString());
        }
    }
}
