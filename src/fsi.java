// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Bundle;
import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class fsi
{

    public static final fsi a = new fsi();
    private Pattern b[];
    private String c[];

    private fsi()
    {
        b = new Pattern[0];
        c = new String[0];
    }

    private void a(String as[], String as1[])
    {
        int i = 0;
        this;
        JVM INSTR monitorenter ;
        boolean flag;
        if (as.length == as1.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g.b(flag);
        b = new Pattern[as.length];
        c = as1;
_L1:
        if (i >= as.length)
        {
            break MISSING_BLOCK_LABEL_64;
        }
        b[i] = Pattern.compile(as[i]);
        i++;
          goto _L1
        this;
        JVM INSTR monitorexit ;
        return;
        as;
        throw as;
    }

    public String a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = TextUtils.isEmpty(s);
        if (!flag) goto _L2; else goto _L1
_L1:
        String s1 = null;
_L4:
        this;
        JVM INSTR monitorexit ;
        return s1;
_L2:
        int i = 0;
_L5:
        s1 = s;
        if (i >= b.length) goto _L4; else goto _L3
_L3:
        s = b[i].matcher(s).replaceAll(c[i]);
        i++;
          goto _L5
        s;
        throw s;
    }

    public void a(Bundle bundle)
    {
        a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
    }

}
