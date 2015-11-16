// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.InputStream;
import java.lang.reflect.Type;
import java.nio.charset.Charset;

public interface hob
{

    public abstract Object parseAndClose(InputStream inputstream, Charset charset, Class class1);

    public abstract Object parseAndClose(InputStream inputstream, Charset charset, Type type);
}
