// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;

public final class ceq extends cfh
{

    public ceq()
    {
    }

    Intent a(Context context, int i, String s)
    {
        Intent intent = new Intent();
        intent.putExtra("account_id", i);
        intent.putExtra("conversationIdSetString", s);
        return b(context, intent);
    }

    public void a(Context context, Intent intent)
    {
        int i = intent.getIntExtra("account_id", -1);
        intent = intent.getStringExtra("conversationIdSetString");
        cet cet1 = cep.g;
        intent = edb.a(intent);
        if (aoq.b(new aow(context, i), intent) > 0 && cfo.f(context, i))
        {
            cet.a(context, i, true);
        }
    }
}
