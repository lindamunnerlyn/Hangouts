// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.lang.ref.ReferenceQueue;

public interface jja
{

    public abstract int a();

    public abstract jja a(ReferenceQueue referencequeue, Object obj, com.google.common.cache.LocalCache.ReferenceEntry referenceentry);

    public abstract void a(Object obj);

    public abstract com.google.common.cache.LocalCache.ReferenceEntry b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract Object get();
}
