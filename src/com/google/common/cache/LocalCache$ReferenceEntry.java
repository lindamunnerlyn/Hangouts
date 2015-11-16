// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import jpw;

public interface 
{

    public abstract long getAccessTime();

    public abstract int getHash();

    public abstract Object getKey();

    public abstract  getNext();

    public abstract  getNextInAccessQueue();

    public abstract  getNextInWriteQueue();

    public abstract  getPreviousInAccessQueue();

    public abstract  getPreviousInWriteQueue();

    public abstract jpw getValueReference();

    public abstract long getWriteTime();

    public abstract void setAccessTime(long l);

    public abstract void setNextInAccessQueue( );

    public abstract void setNextInWriteQueue( );

    public abstract void setPreviousInAccessQueue( );

    public abstract void setPreviousInWriteQueue( );

    public abstract void setValueReference(jpw jpw);

    public abstract void setWriteTime(long l);
}
