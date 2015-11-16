// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

final class ggf
    implements hob
{

    final ggd a;

    ggf(ggd ggd)
    {
        a = ggd;
        super();
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Class class1)
    {
        int i;
        class1 = new BufferedInputStream(inputstream);
        charset = new ByteArrayOutputStream();
        i = class1.read();
_L1:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        charset.write((byte)i);
        i = class1.read();
          goto _L1
        class1 = new ggc();
        class1.a = charset.toByteArray();
        inputstream.close();
        return class1;
        charset;
        inputstream.close();
        throw charset;
    }

    public Object parseAndClose(InputStream inputstream, Charset charset, Type type)
    {
        return parseAndClose(inputstream, charset, type);
    }
}
