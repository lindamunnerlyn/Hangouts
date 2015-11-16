// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.apps.gcomm.hangout.proto;

import kwj;
import kwm;
import kwq;
import kws;

public final class clear extends kwm
{

    private static volatile mergeFrom _emptyArray[];

    public static clear[] emptyArray()
    {
        if (_emptyArray == null)
        {
            synchronized (kwq.a)
            {
                if (_emptyArray == null)
                {
                    _emptyArray = new _emptyArray[0];
                }
            }
        }
        return _emptyArray;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static _emptyArray parseFrom(kwj kwj1)
    {
        return (new <init>()).mergeFrom(kwj1);
    }

    public static mergeFrom parseFrom(byte abyte0[])
    {
        return (mergeFrom)kws.mergeFrom(new <init>(), abyte0);
    }

    public <init> clear()
    {
        unknownFieldData = null;
        cachedSize = -1;
        return this;
    }

    public cachedSize mergeFrom(kwj kwj1)
    {
_L3:
        int i = kwj1.a();
        i;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 33;
           goto _L1 _L2
_L1:
        if (super.storeUnknownField(kwj1, i)) goto _L3; else goto _L2
_L2:
        return this;
    }

    public volatile kws mergeFrom(kwj kwj1)
    {
        return mergeFrom(kwj1);
    }

    public ()
    {
        clear();
    }
}
