// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.AsyncTask;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import java.util.Arrays;

final class dcl extends AsyncTask
{

    final int a;
    final dck b;

    dcl(dck dck1, int i)
    {
        b = dck1;
        a = i;
        super();
    }

    protected Object doInBackground(Object aobj[])
    {
        java.util.List list;
        byte byte0;
        if (b.b.getCheckedRadioButtonId() == h.eA)
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
        return csl.a(a, byte0, ((Integer) (aobj)), list);
    }

    protected void onPostExecute(Object obj)
    {
        obj = (csl)obj;
        if (!((csl) (obj)).m())
        {
            obj = (den)((csl) (obj)).e();
            b.a.setText(((den) (obj)).h.toString());
        }
    }
}
