// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import com.google.android.apps.hangouts.realtimechat.RealTimeChatService;

final class dgk extends djj
{

    final dgj a;

    dgk(dgj dgj, String s, long l, long l1)
    {
        a = dgj;
        super(s, l, l1);
    }

    public String a(Object obj)
    {
        obj = String.valueOf(RealTimeChatService.g(((Intent)obj).getIntExtra("op", -1)));
        if (((String) (obj)).length() != 0)
        {
            return "opcode: ".concat(((String) (obj)));
        } else
        {
            return new String("opcode: ");
        }
    }
}
